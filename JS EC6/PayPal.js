const Payment = require ('./Payment');
class PayPal extends Payment {
    constructor(id, value, email) {
        super(id, value)
        this.email = email;
    }
}
module.exports = Paypal;
