package luu.indepth.item.custom;

import net.minecraft.block.ButtonBlock;
import net.minecraft.sound.SoundEvent;

public class ModStoneButtonBlock extends ButtonBlock {
    public ModStoneButtonBlock(Settings settings, int pressTicks, boolean wooden, SoundEvent clickOffSound, SoundEvent clickOnSound) {
        super(settings, pressTicks, wooden, clickOffSound, clickOnSound);
    }

}
