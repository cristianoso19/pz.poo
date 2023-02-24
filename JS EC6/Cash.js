const Payment = require ('./Payment');
class Cash extends Payment {
    constructor(id, value, currency) {
        super(id, value)
        this.currency = currency;
    }
}
module.exports = Cash
