package com.isjwjwjw.fantasyforgery.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class InfuserBlock extends HorizontalDirectionalBlock {

    public static final MapCodec<InfuserBlock> CODEC = simpleCodec(InfuserBlock::new);

    private static final VoxelShape SHAPE_NORTH = Shapes.or(
            Block.box(0,  12, 2,  16, 16, 14),  // top
            Block.box(2,  10, 4,  14, 12, 12),  // middle
            Block.box(2,  2,  5,  14, 5,  11),  // base top
            Block.box(1,  0,  4,  15, 2,  12),  // base bottom
            Block.box(3,  5,  6,  13, 10, 10)   // pillar
    );

    private static final VoxelShape SHAPE_SOUTH = rotateShape(Direction.SOUTH);
    private static final VoxelShape SHAPE_EAST  = rotateShape(Direction.EAST);
    private static final VoxelShape SHAPE_WEST  = rotateShape(Direction.WEST);

    protected InfuserBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context){
        return this.defaultBlockState().setValue(FACING,
                context.getHorizontalDirection().getOpposite());
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            case SOUTH -> SHAPE_SOUTH;
            case EAST  -> SHAPE_EAST;
            case WEST  -> SHAPE_WEST;
            default    -> SHAPE_NORTH;
        };
    }

    private static VoxelShape rotateShape(Direction dir) {
        VoxelShape[] buffer = new VoxelShape[]{InfuserBlock.SHAPE_NORTH, Shapes.empty() };
        int times = (dir.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;
        for (int i = 0; i < times; i++) {
            buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) ->
                    buffer[1] = Shapes.or(buffer[1],
                            Block.box(
                                    (1 - maxZ) * 16, minY * 16, minX * 16,
                                    (1 - minZ) * 16, maxY * 16, maxX * 16
                            ))
            );
            buffer[0] = buffer[1];
            buffer[1] = Shapes.empty();
        }
        return buffer[0];
    }
}
