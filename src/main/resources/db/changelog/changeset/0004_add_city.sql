INSERT INTO country (name)
VALUES ('Japan'),
       ('India'),
       ('China'),
       ('Brazil'),
       ('Mexico'),
       ('Egypt'),
       ('Bangladesh'),
       ('United States'),
       ('Pakistan'),
       ('Argentina'),
       ('Turkey'),
       ('Philippines'),
       ('Nigeria'),
       ('DR Congo'),
       ('Russia'),
       ('France'),
       ('Colombia'),
       ('Indonesia'),
       ('Peru'),
       ('Thailand'),
       ('South Korea'),
       ('United Kingdom'),
       ('Iran'),
       ('Vietnam'),
       ('Angola'),
       ('Malaysia');

INSERT INTO city (name, country_id)
VALUES ('Tokyo', (SELECT id FROM country WHERE name = 'Japan')),
       ('Delhi', (SELECT id FROM country WHERE name = 'India')),
       ('Shanghai', (SELECT id FROM country WHERE name = 'China')),
       ('São Paulo', (SELECT id FROM country WHERE name = 'Brazil')),
       ('Mexico City', (SELECT id FROM country WHERE name = 'Mexico')),
       ('Cairo', (SELECT id FROM country WHERE name = 'Egypt')),
       ('Mumbai', (SELECT id FROM country WHERE name = 'India')),
       ('Beijing', (SELECT id FROM country WHERE name = 'China')),
       ('Dhaka', (SELECT id FROM country WHERE name = 'Bangladesh')),
       ('Osaka', (SELECT id FROM country WHERE name = 'Japan')),
       ('New York', (SELECT id FROM country WHERE name = 'United States')),
       ('Karachi', (SELECT id FROM country WHERE name = 'Pakistan')),
       ('Buenos Aires', (SELECT id FROM country WHERE name = 'Argentina')),
       ('Chongqing', (SELECT id FROM country WHERE name = 'China')),
       ('Istanbul', (SELECT id FROM country WHERE name = 'Turkey')),
       ('Kolkata', (SELECT id FROM country WHERE name = 'India')),
       ('Manila', (SELECT id FROM country WHERE name = 'Philippines')),
       ('Lagos', (SELECT id FROM country WHERE name = 'Nigeria')),
       ('Rio de Janeiro', (SELECT id FROM country WHERE name = 'Brazil')),
       ('Tianjin', (SELECT id FROM country WHERE name = 'China')),
       ('Kinshasa', (SELECT id FROM country WHERE name = 'DR Congo')),
       ('Guangzhou', (SELECT id FROM country WHERE name = 'China')),
       ('Los Angeles', (SELECT id FROM country WHERE name = 'United States')),
       ('Moscow', (SELECT id FROM country WHERE name = 'Russia')),
       ('Shenzhen', (SELECT id FROM country WHERE name = 'China')),
       ('Lahore', (SELECT id FROM country WHERE name = 'Pakistan')),
       ('Bangalore', (SELECT id FROM country WHERE name = 'India')),
       ('Paris', (SELECT id FROM country WHERE name = 'France')),
       ('Bogotá', (SELECT id FROM country WHERE name = 'Colombia')),
       ('Jakarta', (SELECT id FROM country WHERE name = 'Indonesia')),
       ('Chennai', (SELECT id FROM country WHERE name = 'India')),
       ('Lima', (SELECT id FROM country WHERE name = 'Peru')),
       ('Bangkok', (SELECT id FROM country WHERE name = 'Thailand')),
       ('Seoul', (SELECT id FROM country WHERE name = 'South Korea')),
       ('Nagoya', (SELECT id FROM country WHERE name = 'Japan')),
       ('Hyderabad', (SELECT id FROM country WHERE name = 'India')),
       ('London', (SELECT id FROM country WHERE name = 'United Kingdom')),
       ('Tehran', (SELECT id FROM country WHERE name = 'Iran')),
       ('Chicago', (SELECT id FROM country WHERE name = 'United States')),
       ('Chengdu', (SELECT id FROM country WHERE name = 'China')),
       ('Nanjing', (SELECT id FROM country WHERE name = 'China')),
       ('Wuhan', (SELECT id FROM country WHERE name = 'China')),
       ('Ho Chi Minh City', (SELECT id FROM country WHERE name = 'Vietnam')),
       ('Luanda', (SELECT id FROM country WHERE name = 'Angola')),
       ('Ahmedabad', (SELECT id FROM country WHERE name = 'India')),
       ('Kuala Lumpur', (SELECT id FROM country WHERE name = 'Malaysia')),
       ('Xi''an', (SELECT id FROM country WHERE name = 'China')),
       ('Hong Kong', (SELECT id FROM country WHERE name = 'China')),
       ('Dongguan', (SELECT id FROM country WHERE name = 'China')),
       ('Hangzhou', (SELECT id FROM country WHERE name = 'China'))