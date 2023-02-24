class payPal:
    email : str

    def __init__(self, id, value, email):
        super().__init__(id, value)
        self.email = email