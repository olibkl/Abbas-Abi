CREATE TABLE IF NOT EXISTS strecke (
    Strecken_ID NUMBER PRIMARY KEY,
    Startbahnhof NUMBER REFERENCES Bahnhof(Bahnhofs_ID),
    Zielbahnhof NUMBER REFERENCES Bahnhof(Bahnhofs_ID),
    Entfernung NUMBER,
    Erlaubte_Zugklassen VARCHAR2(50)
);
