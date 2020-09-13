package org.bukkit.craftbukkit.util;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.particles.IParticleData;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EmptyTickList;
import net.minecraft.world.ITickList;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.IWorldInfo;
import org.bukkit.HeightMap;
import org.jetbrains.annotations.Nullable;

public class DummyGeneratorAccess implements IWorld {

    public static final IWorld INSTANCE = new DummyGeneratorAccess();

    @Override
    public ITickList<Block> getPendingBlockTicks() {
        return EmptyTickList.get();
    }

    @Override
    public ITickList<Fluid> getPendingFluidTicks() {
        return EmptyTickList.get();
    }

    @Override
    public IWorldInfo getWorldInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DifficultyInstance getDifficultyForLocation(BlockPos pos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public AbstractChunkProvider getChunkProvider() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Random getRandom() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void playSound(@Nullable PlayerEntity player, BlockPos pos, SoundEvent soundIn, SoundCategory category, float volume, float pitch) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addParticle(IParticleData particleData, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void playEvent(@Nullable PlayerEntity player, int type, BlockPos pos, int data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ServerWorld getMinecraftWorld() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IRegistryCustom r() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Entity> getEntities(Entity entity, AxisAlignedBB aabb, Predicate<? super Entity> prdct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T extends Entity> List<T> a(Class<? extends T> type, AxisAlignedBB aabb, Predicate<? super T> prdct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<? extends EntityHuman> getPlayers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IChunkAccess getChunkAt(int i, int i1, ChunkStatus cs, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int a(HeightMap.Type type, int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int c() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BiomeManager d() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BiomeBase a(int i, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean s_() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getSeaLevel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DimensionManager getDimensionManager() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public LightEngine e() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TileEntity getTileEntity(BlockPosition blockposition) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IBlockData getType(BlockPosition blockposition) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Fluid getFluid(BlockPosition blockposition) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WorldBorder getWorldBorder() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean a(BlockPosition bp, Predicate<IBlockData> prdct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean a(BlockPosition blockposition, IBlockData iblockdata, int i, int j) {
        return false;
    }

    @Override
    public boolean a(BlockPosition blockposition, boolean flag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasBlockState(BlockPos p_217375_1_, Predicate<BlockState> p_217375_2_) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
