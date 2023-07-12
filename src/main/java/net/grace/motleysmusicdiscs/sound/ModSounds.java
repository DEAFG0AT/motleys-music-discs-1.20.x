package net.grace.motleysmusicdiscs.sound;

import net.grace.motleysmusicdiscs.MotleysMusicDiscs;
import net.minecraft.client.sound.SoundEngine;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent ALLEYESONME = registerSoundEvent("alleyesonme");
    public static final SoundEvent KOKOMO = registerSoundEvent("kokomo");
    public static final SoundEvent UNDERPRESSURE = registerSoundEvent("underpressure");
    public static final SoundEvent BUTTERCUP = registerSoundEvent("buttercup");
    public static final SoundEvent WAP = registerSoundEvent("wap");
    public static final SoundEvent BODIES = registerSoundEvent("bodies");



    private static SoundEvent registerSoundEvent(String name) {
        Identifier identifier = new Identifier(MotleysMusicDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void registerSounds() {
        MotleysMusicDiscs.LOGGER.info("Registering Mod Sounds for " + MotleysMusicDiscs.MOD_ID);
    }
}
