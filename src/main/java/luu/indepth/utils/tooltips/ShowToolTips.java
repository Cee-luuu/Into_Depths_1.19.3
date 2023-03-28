package luu.indepth.utils.tooltips;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

import java.util.List;

public class ShowToolTips {

	public static void showTooltips (List<Text> tooltip, String tooltipShift){

		if (!Screen.hasShiftDown()) { tooltip.add(Text.translatable("tooltip.hold_shift"));
		} else { tooltip.add(Text.translatable(tooltipShift)); }
	}

	public static void showTooltips (List<Text> tooltip, String tooltipShift, String tooltipCtrl){

		if (!Screen.hasShiftDown()) { tooltip.add(Text.translatable("tooltip.hold_shift"));
		} else { tooltip.add(Text.translatable(tooltipShift)); }

		if (!Screen.hasControlDown()) { tooltip.add(Text.translatable("tooltip.hold_ctrl"));
		} else { tooltip.add(Text.translatable(tooltipCtrl)); }
	}

	public static void showTooltips (List<Text> tooltip, String tooltipShift, String tooltipCtrl, String tooltipAlt){

		if (!Screen.hasShiftDown()) { tooltip.add(Text.translatable("tooltip.hold_shift"));
		} else { tooltip.add(Text.translatable(tooltipShift)); }

		if (!Screen.hasControlDown()) { tooltip.add(Text.translatable("tooltip.hold_ctrl"));
		} else { tooltip.add(Text.translatable(tooltipCtrl)); }

		if (!Screen.hasAltDown()) { tooltip.add(Text.translatable("tooltip.hold_alt"));
		} else { tooltip.add(Text.translatable(tooltipAlt)); }
	}
}
