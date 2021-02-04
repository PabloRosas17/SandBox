package sandbox.open.sqiap

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import sqip.CardEntry
import sqip.CardEntry.DEFAULT_CARD_ENTRY_REQUEST_CODE

/**
 * @author, evolandlupiz
 * @date, 4/13/2020
 * @property, sqiap
 * @purpose, main used to instantiate the application.
 */

/** @desc main activity will test a simple square in-app sdk and reproduce moshi error */
class SqiapActivity : AppCompatActivity() {

    /**
     * Setup layout.
     */
    override fun onCreate(state: Bundle?) {
        println("SqiapActivity.kt, onCreate()")
        super.onCreate(state)
        this.setContentView(R.layout.layout_sqiap)
        val btnFireError = this.findViewById<Button>(R.id.btn_fire_error)
        btnFireError.setOnClickListener {
            println("btnFireError is pressed.")
            CardEntry.startCardEntryActivity(
                activity = this
                , collectPostalCode = true
                , requestCode = DEFAULT_CARD_ENTRY_REQUEST_CODE);
        }
        this.setup()
    }

    /**
     * Card Nonce Background Handler.
     */
    private fun setup(){
        val mCardHandler = CardEntryHandler()
        CardEntry.setCardNonceBackgroundHandler(mCardHandler)
    }
}