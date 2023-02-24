class Card:
    cardNumber : str
    secureNumber : str
    mark : str

    def __init__(self, id, value, cardNumber, secureNumber):
        super().__init__(id, value)
        self.cardNumber = cardNumber
        self.secureNumber = secureNumber