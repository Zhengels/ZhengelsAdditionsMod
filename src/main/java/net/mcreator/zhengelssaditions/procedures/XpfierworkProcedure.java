package net.mcreator.zhengelssaditions.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModItems;

import java.util.function.Supplier;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class XpfierworkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xp = 0;
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 1) != 1 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == Items.IRON_INGOT) {
			xp = 1;
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 68) {
				xp = 11978;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_10.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 50) {
				xp = 5345;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_9.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 35) {
				xp = 2045;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_8.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 26) {
				xp = 997;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_7.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 25) {
				xp = 910;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_6.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 24) {
				xp = 828;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_5.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 23) {
				xp = 751;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_4.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 21) {
				xp = 612;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_4.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 20) {
				xp = 550;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_3.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 18) {
				xp = 441;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_3.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 15) {
				xp = 315;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_2.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 12) {
				xp = 216;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_2.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 8) {
				xp = 112;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_2.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 5) {
				xp = 55;
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.XPSTORAGE_1.get()).copy();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			}
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 5) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final int _amount = 1;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
							}
						});
					}
				}
				(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("xp", xp);
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-((int) xp));
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 1), (z + 0.5), (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), 1)));
					entityToSpawn.setPickUpDelay(2);
					_level.addFreshEntity(entityToSpawn);
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final int _amount = 1;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
							}
						});
					}
				}
			}
		}
		if (!(entity instanceof ServerPlayer _plr39 && _plr39.level() instanceof ServerLevel
				&& _plr39.getAdvancements().getOrStartProgress(_plr39.server.getAdvancements().getAdvancement(new ResourceLocation("zhengelss_aditions:xpstoring"))).isDone())) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("zhengelss_aditions:xpstoring"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}
