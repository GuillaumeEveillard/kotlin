/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.resolve.transformers

import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.declarations.FirFile
import org.jetbrains.kotlin.fir.declarations.FirResolvePhase
import org.jetbrains.kotlin.fir.visitors.FirTransformer

// TODO: rework, see rr/FIR/semoro-dev FirStagesTransformerFactory
class FirTotalResolveTransformer(session: FirSession) {

    val transformers: List<FirTransformer<Nothing?>> =
        FirResolvePhase.values()
            .drop(1) // to remove RAW_FIR phase
            .map { it.createTransformerByPhase(session) }

    fun processFiles(files: List<FirFile>) {
        for (transformer in transformers) {
            for (firFile in files) {
                transformer.visitFile(firFile, null)
            }
        }
    }
}
