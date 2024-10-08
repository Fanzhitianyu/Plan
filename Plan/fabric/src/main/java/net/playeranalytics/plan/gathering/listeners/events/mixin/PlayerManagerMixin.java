/*
 *  This file is part of Player Analytics (Plan).
 *
 *  Plan is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License v3 as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Plan is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Plan. If not, see <https://www.gnu.org/licenses/>.
 */
package net.playeranalytics.plan.gathering.listeners.events.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.server.PlayerManager;
import net.minecraft.text.Text;
import net.playeranalytics.plan.gathering.listeners.events.PlanFabricEvents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

@Mixin(PlayerManager.class)
public class PlayerManagerMixin {

    @Inject(method = "checkCanJoin", at = @At(value = "TAIL"))
    public void onLogin(SocketAddress address, GameProfile profile, CallbackInfoReturnable<Text> cir) {
//        if(isLocalhost(address))
            PlanFabricEvents.ON_LOGIN.invoker().onLogin(address, profile, cir.getReturnValue());
    }

//    @Unique
//    private static boolean isLocalhost(SocketAddress socketAddress) {
//        if (socketAddress instanceof InetSocketAddress inetSocketAddress) {
//            String hostAddress = inetSocketAddress.getAddress().getHostAddress();
//            return "127.0.0.1".equals(hostAddress) || "::1".equals(hostAddress) || "localhost".equals(hostAddress);
//        }
//        return false;
//    }

}
