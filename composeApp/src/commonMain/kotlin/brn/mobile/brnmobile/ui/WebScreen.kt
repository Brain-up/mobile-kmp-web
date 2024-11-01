package brn.mobile.brnmobile.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.multiplatform.webview.util.KLogSeverity
import com.multiplatform.webview.web.WebView
import com.multiplatform.webview.web.WebViewState
import com.multiplatform.webview.web.rememberWebViewState

internal object WebScreen : Screen {
    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val initialUrl = "https://github.com/KevinnZou/compose-webview-multiplatform"
        val webViewState = rememberWebViewState(url = initialUrl)
        LaunchedEffect(Unit) {
            initWebView(webViewState)
//            initJsBridge(jsBridge)
        }
        WebViewSample()
    }
    @Composable
    internal fun WebViewSample() {
        MaterialTheme {
            val webViewState =
                rememberWebViewState("https://brainup.site")
            Column(Modifier.fillMaxSize()) {
                val text = webViewState.let {
                    "${it.pageTitle ?: ""} ${it.loadingState} ${it.lastLoadedUrl ?: ""}"
                }
                Text(text)
                WebView(
                    state = webViewState,
                    modifier = Modifier.fillMaxSize()
                )
            }

        }
    }

    private fun initWebView(webViewState: WebViewState) {
        webViewState.webSettings.apply {
            customUserAgentString =
                "Mozilla/5.0 (Macintosh; Intel Mac OS X 11_1) AppleWebKit/625.20 (KHTML, like Gecko) Version/14.3.43 Safari/625.20"
            zoomLevel = 1.0
            isJavaScriptEnabled = true
            logSeverity = KLogSeverity.Debug
            allowFileAccessFromFileURLs = true
            allowUniversalAccessFromFileURLs = true
            androidWebSettings.apply {
                isAlgorithmicDarkeningAllowed = true
                safeBrowsingEnabled = false
                allowProtectedMedia = true
                allowFileAccess = true
            }
        }
    }
}