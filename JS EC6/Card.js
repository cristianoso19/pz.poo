const Payment = require ('./Payment');
class Card extends Payment {
    constructor(id, value, cardNumber, secureCode, mark) {
        super(id, value)
        this.cardNumber = cardNumber;
        this.secureCode = secureCode;
        this.mark = mark;
    }
}
module.exports = Card
