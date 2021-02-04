sb0 - shows the square in-app sdk having some issues with moshi
/* IF YOU ENABLE THESE THEY WILL CRASH THE SQUARE IN-APP SDK,
* java.lang.RuntimeException: Unable to start activity ComponentInfo
* {sandbox.open.sqiap/sqip.internal.CardEntryActivity}: java.lang.IllegalArgumentException:
* Cannot serialize Kotlin type sqip.internal.nonce.CreateCardNonceErrorResponse.
* Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior.
* Please use KotlinJsonAdapter from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact. */
//implementation 'com.squareup.moshi:moshi-kotlin:1.9.2'
//kapt 'com.squareup.moshi:moshi-kotlin-codegen:1.9.2'
