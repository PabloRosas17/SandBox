package sandbox.open.sqiap

import sqip.CardDetails
import sqip.CardEntryActivityCommand
import sqip.CardNonceBackgroundHandler

/**
 * @author, evolandlupiz
 * @date, 4/13/2020
 * @property, sqiap
 * @purpose, calls backend service to process payment.
 */

/** @desc calls the backend service and process the nonce while the payment form is still open */
class CardEntryHandler : CardNonceBackgroundHandler {

    /**
     * Run service to process payment.
     */
    override fun handleEnteredCardInBackground(cardDetails: CardDetails): CardEntryActivityCommand {
        println("CardEntryHandler.kt, handleEnteredCardInBackground()")
        return CardEntryActivityCommand.Finish()
    }
}