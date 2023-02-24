class Cash:
    currency : str

    def __init__(self, id, value, currency):
        super().__init__(id, value)
        self.currency = currency