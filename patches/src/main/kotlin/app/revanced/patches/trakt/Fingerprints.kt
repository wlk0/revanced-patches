package app.revanced.patches.trakt

import app.revanced.patcher.fingerprint

internal val isVIPEPFingerprint = fingerprint {
    custom { method, classDef ->
        if (!classDef.endsWith("RemoteUser;")) return@custom false

        method.name == "isVIPEP_a"
    }
}

internal val isVIPFingerprint = fingerprint {
    custom { method, classDef ->
        if (!classDef.endsWith("RemoteUser;")) return@custom false

        method.name == "isVIP_a"
    }
}

internal val remoteUserFingerprint = fingerprint {
    custom { _, classDef ->
        classDef.endsWith("RemoteUser;")
    }
}
