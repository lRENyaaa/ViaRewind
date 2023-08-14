/*
 * This file is part of ViaRewind - https://github.com/ViaVersion/ViaRewind
 * Copyright (C) 2016-2023 ViaVersion and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.gerrygames.viarewind;

import de.gerrygames.viarewind.api.ViaRewindPlatform;
import net.md_5.bungee.api.plugin.Plugin;

import java.io.File;

public class BungeePlugin extends Plugin implements ViaRewindPlatform {

    @Override
    public void onEnable() {
        ViaRewindConfig conf = new ViaRewindConfig(new File(getDataFolder(), "config.yml"));
        conf.reloadConfig();
        this.init(conf);
    }
}
