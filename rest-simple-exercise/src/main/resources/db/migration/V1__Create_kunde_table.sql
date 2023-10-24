CREATE TABLE IF NOT EXISTS Kunde (
    Kunden_ID NUMBER PRIMARY KEY,
    Name VARCHAR2(50),
    Adresse VARCHAR2(100),
    Telefonnummer VARCHAR2(15),
    Email VARCHAR2(50),
    Bevorzugte_Zahlungsmethoden VARCHAR2(50)
);
