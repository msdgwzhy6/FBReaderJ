/*
 * Copyright (C) 2007-2015 FBReader.ORG Limited <contact@fbreader.org>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.fbreader.fbreader.options;

import org.geometerplus.zlibrary.core.options.*;

public class FooterOptions {
	public final String Screen;

	public final ZLBooleanOption ShowTOCMarks;
	public final ZLBooleanOption ShowClock;
	public final ZLBooleanOption ShowBattery;
	public final ZLBooleanOption ShowProgress;
	public final ZLStringOption Font;

	public FooterOptions(String screen) {
		Screen = screen;
		final String prefix = "Base".equals(screen) ? "" : screen + ":";

		ShowTOCMarks = new ZLBooleanOption("Options", prefix + "FooterShowTOCMarks", "Base".equals(screen));
		ShowClock = new ZLBooleanOption("Options", prefix + "ShowClockInFooter", true);
		ShowBattery = new ZLBooleanOption("Options", prefix + "ShowBatteryInFooter", true);
		ShowProgress = new ZLBooleanOption("Options", prefix + "ShowProgressInFooter", true);
		Font = new ZLStringOption("Options", prefix + "FooterFont", "Droid Sans");
	}
}
