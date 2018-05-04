/*
 * Copyright (c) Terl Tech Ltd • 04/05/18 23:13 • goterl.com
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at http://mozilla.org/MPL/2.0/.
 */

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import com.goterl.lazycode.lazysodium.LazySodium;
import com.goterl.lazycode.lazysodium.Sodium;
import com.goterl.lazycode.lazysodium.exceptions.SodiumException;
import com.goterl.lazycode.lazysodium.interfaces.KeyDerivation;
import com.goterl.lazycode.lazysodium.interfaces.PwHash;
import com.goterl.lazycode.lazysodium.interfaces.Random;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class BaseTest {

    public final String PASSWORD = "catdog";
    public final byte[] PASSWORD_BYTES = PASSWORD.getBytes(StandardCharsets.UTF_8);
    public final int PASSWORD_BYTES_LEN = PASSWORD_BYTES.length;

    public static LazySodium lazySodium;

    public static Random random;
    public static PwHash.Native pwHash;
    public static PwHash.Lazy pwHashLazy;

    public static KeyDerivation.Native keyDerivation;
    public static KeyDerivation.Lazy keyDerivationLazy;



    @BeforeClass
    public static void beforeClass() {
        Sodium sodium = new Sodium();
        lazySodium = new LazySodium(sodium);
        random = (Random) lazySodium;
        pwHash = (PwHash.Native) lazySodium;
        pwHashLazy = (PwHash.Lazy) lazySodium;
        keyDerivation = (KeyDerivation.Native) lazySodium;
        keyDerivationLazy = (KeyDerivation.Lazy) lazySodium;
    }


}
