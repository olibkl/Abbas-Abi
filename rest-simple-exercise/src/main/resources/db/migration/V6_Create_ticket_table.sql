CREATE TABLE IF NOT EXISTS Ticket (
    Ticket_ID NUMBER PRIMARY KEY,
    Kunden_ID NUMBER REFERENCES Kunde(Kunden_ID),
    Strecken_ID NUMBER REFERENCES Strecke(Strecken_ID),
    Zug_ID NUMBER REFERENCES Zug(Zug_ID),
    Preis NUMBER,
    Gueltigkeitszeitraum DATE
);