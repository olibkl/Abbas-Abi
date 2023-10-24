CREATE TABLE IF NOT EXISTS Strecke_Bahnhof (
    Strecken_ID NUMBER REFERENCES Strecke(Strecken_ID),
    Bahnhofs_ID NUMBER REFERENCES Bahnhof(Bahnhofs_ID),
    PRIMARY KEY (Strecken_ID, Bahnhofs_ID)
);
