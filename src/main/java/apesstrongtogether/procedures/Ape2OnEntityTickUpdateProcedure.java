package apesstrongtogether.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

import apesstrongtogether.entity.Bossape2Entity;
import apesstrongtogether.entity.Ape2Entity;

import apesstrongtogether.ApesStrongTogetherModElements;

import apesstrongtogether.ApesStrongTogetherMod;

@ApesStrongTogetherModElements.ModElement.Tag
public class Ape2OnEntityTickUpdateProcedure extends ApesStrongTogetherModElements.ModElement {
	public Ape2OnEntityTickUpdateProcedure(ApesStrongTogetherModElements instance) {
		super(instance, 116);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency x for procedure Ape2OnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency y for procedure Ape2OnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency z for procedure Ape2OnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency world for procedure Ape2OnEntityTickUpdate!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double ape_count = 0;
		boolean found = false;
		boolean is_ape_3_present = false;
		if ((!(is_ape_3_present))) {
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator instanceof Ape2Entity.CustomEntity)) {
						ape_count = (double) ((ape_count) + 1);
					}
				}
			}
			if (((ape_count) >= 6)) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new Bossape2Entity.CustomEntity(Bossape2Entity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if ((entityiterator instanceof Ape2Entity.CustomEntity)) {
							if (!entityiterator.world.isRemote())
								entityiterator.remove();
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z, (int) 5, 5, 5, 5, 1);
							}
						}
					}
				}
			}
		}
	}
}
