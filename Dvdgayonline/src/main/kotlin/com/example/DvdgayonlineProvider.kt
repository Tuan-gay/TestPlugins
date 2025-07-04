package com.Dvdgayonline

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context
import com.lagradost.cloudstream3.extractors.EmturbovidExtractor
import com.lagradost.cloudstream3.extractors.FileMoonSx
import com.lagradost.cloudstream3.extractors.StreamTape

@CloudstreamPlugin
class DvdgayonlineProvider: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Dvdgayonline())
        registerExtractorAPI(EmturbovidExtractor())
        registerExtractorAPI(FileMoonSx())
        registerExtractorAPI(DoodPmExtractor())
        registerExtractorAPI(Vidguardto())
        registerExtractorAPI(MixDropAG())
        registerExtractorAPI(Lulustream())
        registerExtractorAPI(StreamTape())
    }
}
