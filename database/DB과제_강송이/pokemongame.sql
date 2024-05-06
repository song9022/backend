-- 1. 테이블 생성

-- 플레이어(Player) 테이블: 플레이어 정보를 저장
CREATE TABLE player (
    player_id    INTEGER NOT NULL,  -- 플레이어 식별자
    username     VARCHAR2(50),      -- 플레이어 이름
    email        VARCHAR2(100),     -- 이메일 주소
    password     VARCHAR2(225),     -- 비밀번호
    coin         INTEGER,           -- 보유 코인
    city_city_id INTEGER NOT NULL, -- 해당 플레이어가 속한 도시의 식별자
    CONSTRAINT player_pk PRIMARY KEY (player_id), -- 기본 키 제약 조건: player_id
    CONSTRAINT player_city_fk FOREIGN KEY (city_city_id) REFERENCES city (city_id) -- 외래 키 제약 조건: city_city_id -> city(city_id)
);

-- 인벤토리(Inventory) 테이블: 아이템 보유 정보를 저장
CREATE TABLE inventory (
    inventory_id   INTEGER NOT NULL,  -- 인벤토리 식별자
    quantity       INTEGER,           -- 아이템 수량
    player_player_id INTEGER NOT NULL, -- 해당 인벤토리 소유자 플레이어의 식별자
    item_item_id   INTEGER NOT NULL,  -- 아이템의 식별자
    CONSTRAINT inventory_pk PRIMARY KEY (inventory_id), -- 기본 키 제약 조건: inventory_id
    CONSTRAINT inventory_item_fk FOREIGN KEY (item_item_id) REFERENCES item (item_id), -- 외래 키 제약 조건: item_item_id -> item(item_id)
    CONSTRAINT inventory_player_fk FOREIGN KEY (player_player_id) REFERENCES player (player_id) -- 외래 키 제약 조건: player_player_id -> player(player_id)
);

-- 아이템(Item) 테이블: 게임 아이템 정보를 저장
CREATE TABLE item (
    item_id     INTEGER NOT NULL,  -- 아이템 식별자
    name        VARCHAR2(50),      -- 아이템 이름
    description VARCHAR2(225),     -- 아이템 설명
    price       INTEGER,           -- 아이템 가격
    CONSTRAINT item_pk PRIMARY KEY (item_id) -- 기본 키 제약 조건: item_id
);

-- 포켓몬(Pokemon) 테이블: 플레이어가 소유한 포켓몬 정보를 저장
CREATE TABLE pokemon (
    pokemon_id       INTEGER NOT NULL,  -- 포켓몬 식별자
    name             VARCHAR2(50),      -- 포켓몬 이름
    type             VARCHAR2(20),      -- 포켓몬 타입
    level            INTEGER,           -- 포켓몬 레벨
    exp              INTEGER,           -- 포켓몬 경험치
    hp               INTEGER,           -- 포켓몬 체력
    attack           INTEGER,           -- 포켓몬 공격력
    defense          INTEGER,           -- 포켓몬 방어력
    ability          VARCHAR2(50),      -- 포켓몬 능력
    player_player_id INTEGER NOT NULL, -- 해당 포켓몬 소유자 플레이어의 식별자
    CONSTRAINT pokemon_pk PRIMARY KEY (pokemon_id), -- 기본 키 제약 조건: pokemon_id
    CONSTRAINT pokemon_player_fk FOREIGN KEY (player_player_id) REFERENCES player (player_id) -- 외래 키 제약 조건: player_player_id -> player(player_id)
);

-- 스킬(Skill) 테이블: 포켓몬이 배울 수 있는 스킬 정보를 저장
CREATE TABLE skill (
    skill_id           INTEGER NOT NULL,  -- 스킬 식별자
    name               VARCHAR2(50),      -- 스킬 이름
    type               VARCHAR2(20),      -- 스킬 타입
    effect             VARCHAR2(100),     -- 스킬 효과
    pokemon_pokemon_id INTEGER NOT NULL, -- 해당 스킬을 가진 포켓몬의 식별자
    CONSTRAINT skill_pk PRIMARY KEY (skill_id), -- 기본 키 제약 조건: skill_id
    CONSTRAINT skill_pokemon_fk FOREIGN KEY (pokemon_pokemon_id) REFERENCES pokemon (pokemon_id) -- 외래 키 제약 조건: pokemon_pokemon_id -> pokemon(pokemon_id)
);

-- 배틀(Battle) 테이블: 플레이어 간의 전투 결과를 저장
CREATE TABLE battle (
    battle_id          INTEGER NOT NULL,  -- 배틀 식별자
    result             VARCHAR2(10),      -- 배틀 결과
    pokemon_pokemon_id INTEGER NOT NULL, -- 사용된 포켓몬의 식별자
    player_player_id   INTEGER NOT NULL, -- 배틀한 플레이어의 식별자
    CONSTRAINT battle_pk PRIMARY KEY (battle_id), -- 기본 키 제약 조건: battle_id
    CONSTRAINT battle_player_fk FOREIGN KEY (player_player_id) REFERENCES player (player_id), -- 외래 키 제약 조건: player_player_id -> player(player_id)
    CONSTRAINT battle_pokemon_fk FOREIGN KEY (pokemon_pokemon_id) REFERENCES pokemon (pokemon_id) -- 외래 키 제약 조건: pokemon_pokemon_id -> pokemon(pokemon_id)
);

-- 지역(Region) 테이블: 게임 지역 정보를 저장
CREATE TABLE region (
    region_id INTEGER NOT NULL,  -- 지역 식별자
    name      VARCHAR2(50),      -- 지역 이름
    CONSTRAINT region_pk PRIMARY KEY (region_id) -- 기본 키 제약 조건: region_id
);

-- 도시(City) 테이블: 게임 내 도시 정보를 저장
CREATE TABLE city (
    city_id          INTEGER NOT NULL,  -- 도시 식별자
    name             VARCHAR2(50),      -- 도시 이름
    region_region_id INTEGER NOT NULL, -- 해당 도시가 속한 지역의 식별자
    CONSTRAINT city_pk PRIMARY KEY (city_id), -- 기본 키 제약 조건: city_id
    CONSTRAINT city_region_fk FOREIGN KEY (region_region_id) REFERENCES region (region_id) -- 외래 키 제약 조건: region_region_id -> region(region_id)
);

-- 상점(Shop) 테이블: 게임 내 상점 정보를 저장
CREATE TABLE shop (
    shop_id      INTEGER NOT NULL,  -- 상점 식별자
    name         VARCHAR2(50),      -- 상점 이름
    location     VARCHAR2(100),     -- 상점 위치
    city_city_id INTEGER NOT NULL, -- 해당 상점이 위치한 도시의 식별자
    CONSTRAINT shop_pk PRIMARY KEY (shop_id), -- 기본 키 제약 조건: shop_id
    CONSTRAINT shop_city_fk FOREIGN KEY (city_city_id) REFERENCES city (city_id) -- 외래 키 제약 조건: city_city_id -> city(city_id)
);

-- 거래(Trade) 테이블: 거래 정보를 저장
CREATE TABLE trade (
    t_id             INTEGER NOT NULL,  -- 거래 식별자
    t_date           TIMESTAMP,         -- 거래 날짜
    total_price      INTEGER,           -- 총 거래 가격
    player_player_id INTEGER NOT NULL, -- 거래를 요청한 플레이어의 식별자
    shop_shop_id     INTEGER NOT NULL, -- 거래가 이루어진 상점의 식별자
    region_region_id INTEGER NOT NULL, -- 거래가 이루어진 지역의 식별자
    CONSTRAINT trade_pk PRIMARY KEY (t_id), -- 기본 키 제약 조건: t_id
    CONSTRAINT trade_player_fk FOREIGN KEY (player_player_id) REFERENCES player (player_id), -- 외래 키 제약 조건: player_player_id -> player(player_id)
    CONSTRAINT trade_shop_fk FOREIGN KEY (shop_shop_id) REFERENCES shop (shop_id), -- 외래 키 제약 조건: shop_shop_id -> shop(shop_id)
    CONSTRAINT trade_region_fk FOREIGN KEY (region_region_id) REFERENCES region (region_id) -- 외래 키 제약 조건: region_region_id -> region(region_id)
);

-- 구매(Buy) 테이블: 아이템 구매 정보를 저장
CREATE TABLE buy (
    b_id             INTEGER NOT NULL,  -- 구매 식별자
    b_date           TIMESTAMP,         -- 구매 날짜
    price            INTEGER,           -- 구매 가격
    player_player_id INTEGER NOT NULL, -- 구매한 플레이어의 식별자
    item_item_id     INTEGER NOT NULL, -- 구매한 아이템의 식별자
    CONSTRAINT buy_pk PRIMARY KEY (b_id), -- 기본 키 제약 조건: b_id
    CONSTRAINT buy_item_fk FOREIGN KEY (item_item_id) REFERENCES item (item_id), -- 외래 키 제약 조건: item_item_id -> item(item_id)
    CONSTRAINT buy_player_fk FOREIGN KEY (player_player_id) REFERENCES player (player_id) -- 외래 키 제약 조건: player_player_id -> player(player_id)
);

-- 구매 취소(Buy Cancellation) 테이블: 구매 취소 정보를 저장
CREATE TABLE buycan (
    can_id   INTEGER NOT NULL,  -- 취소 식별자
    can_date TIMESTAMP,         -- 취소 날짜
    reason   VARCHAR2(225),     -- 취소 사유
    buy_b_id INTEGER NOT NULL, -- 취소된 구매의 식별자
    CONSTRAINT buycan_pk PRIMARY KEY (can_id), -- 기본 키 제약 조건: can_id
    CONSTRAINT buycan_buy_fk FOREIGN KEY (buy_b_id) REFERENCES buy (b_id) -- 외래 키 제약 조건: buy_b_id -> buy(b_id)
);

-- 거래 상세(Trade Detail) 테이블: 거래 상세 정보를 저장
CREATE TABLE tradedetail (
    detail_id    INTEGER NOT NULL,  -- 상세 정보 식별자
    quantity     INTEGER,           -- 수량
    item_price   INTEGER,           -- 아이템 가격
    trade_t_id   INTEGER NOT NULL, -- 해당 거래의 식별자
    item_item_id INTEGER NOT NULL, -- 아이템의 식별자
    CONSTRAINT tradedetail_pk PRIMARY KEY (detail_id), -- 기본 키 제약 조건: detail_id
    CONSTRAINT tradedetail_trade_fk FOREIGN KEY (trade_t_id) REFERENCES trade (t_id), -- 외래 키 제약 조건: trade_t_id -> trade(t_id)
    CONSTRAINT tradedetail_item_fk FOREIGN KEY (item_item_id) REFERENCES item (item_id) -- 외래 키 제약 조건: item_item_id -> item(item_id)
);




-- 2. 데이터 삽입
-- Player 데이터 생성
INSERT INTO player (player_id, username, email, password, coin, city_city_id) VALUES
(11, 'user11', 'user11@example.com', 'password11', 6000, 1),
(12, 'user12', 'user12@example.com', 'password12', 6500, 2),
(13, 'user13', 'user13@example.com', 'password13', 7000, 3),
(14, 'user14', 'user14@example.com', 'password14', 7500, 4),
(15, 'user15', 'user15@example.com', 'password15', 8000, 5),
(16, 'user16', 'user16@example.com', 'password16', 8500, 1),
(17, 'user17', 'user17@example.com', 'password17', 9000, 2),
(18, 'user18', 'user18@example.com', 'password18', 9500, 3),
(19, 'user19', 'user19@example.com', 'password19', 10000, 4),
(20, 'user20', 'user20@example.com', 'password20', 10500, 5);

-- Inventory 데이터 생성
INSERT INTO inventory (inventory_id, quantity, player_player_id, item_item_id) VALUES
(11, 3, 11, 1),
(12, 2, 11, 2),
(13, 1, 11, 3),
(14, 1, 12, 1),
(15, 5, 12, 4),
(16, 2, 12, 5),
(17, 3, 13, 2),
(18, 2, 13, 3),
(19, 1, 14, 3),
(20, 4, 14, 5);

-- Item 데이터 생성
INSERT INTO item (item_id, name, description, price) VALUES
(11, 'Revive', 'Revives a fainted Pokemon', 200),
(12, 'Potion', 'Restores 20HP to a Pokemon', 100),
(13, 'Great Ball', 'A better Poke Ball with a higher catch rate', 150),
(14, 'Rare Candy', 'Instantly increases a Pokemon''s level by 1', 300),
(15, 'Escape Rope', 'Allows the player to escape from a cave or dungeon', 250),
(16, 'Super Potion', 'Restores 50HP to a Pokemon', 200),
(17, 'Ultra Ball', 'An even better Poke Ball with a higher catch rate', 350),
(18, 'Max Potion', 'Fully restores the HP of a Pokemon', 500),
(19, 'Master Ball', 'Guaranteed to catch any wild Pokemon without fail', 1000),
(20, 'Max Revive', 'Fully revives and restores a fainted Pokemon', 500);

-- Pokemon 데이터 생성
INSERT INTO pokemon (pokemon_id, name, type, level, exp, hp, attack, defense, ability, player_player_id) VALUES
(11, 'Eevee', 'Normal', 5, 100, 50, 20, 15, 'Adaptability', 11),
(12, 'Vulpix', 'Fire', 7, 150, 60, 25, 20, 'Flash Fire', 12),
(13, 'Meowth', 'Normal', 6, 130, 55, 22, 18, 'Pickup', 13),
(14, 'Pidgey', 'Flying', 6, 130, 55, 22, 18, 'Keen Eye', 14),
(15, 'Abra', 'Psychic', 8, 180, 70, 18, 10, 'Synchronize', 15),
(16, 'Cubone', 'Ground', 10, 250, 80, 30, 25, 'Rock Head', 16),
(17, 'Machop', 'Fighting', 15, 400, 120, 50, 45, 'Guts', 17),
(18, 'Geodude', 'Rock', 12, 320, 100, 45, 40, 'Rock Head', 18),
(19, 'Oddish', 'Grass', 14, 380, 140, 55, 50, 'Chlorophyll', 19),
(20, 'Growlithe', 'Fire', 20, 500, 200, 70, 65, 'Intimidate', 20);

-- Skill 데이터 생성
INSERT INTO skill (skill_id, name, type, effect, pokemon_pokemon_id) VALUES
(11, 'Quick Attack', 'Normal', 'Quick attack that strikes first', 11),
(12, 'Ember', 'Fire', 'Deals fire damage', 12),
(13, 'Fury Swipes', 'Normal', 'Hits 2-5 times in a row', 13),
(14, 'Gust', 'Flying', 'Deals flying damage', 14),
(15, 'Teleport', 'Psychic', 'Allows user to flee from wild battles', 15),
(16, 'Bone Club', 'Ground', 'Deals ground damage', 16),
(17, 'Karate Chop', 'Fighting', 'Has a high critical-hit ratio', 17),
(18, 'Rock Throw', 'Rock', 'Deals rock damage', 18),
(19, 'Absorb', 'Grass', 'User recovers HP equal to half the damage inflicted', 19),
(20, 'Flamethrower', 'Fire', 'Deals fire damage', 20);

-- Battle 데이터 생성
INSERT INTO battle (battle_id, result, pokemon_pokemon_id, player_player_id) VALUES
(11, 'Win', 11, 11),
(12, 'Loss', 12, 12),
(13, 'Win', 13, 13),
(14, 'Loss', 14, 14),
(15, 'Win', 15, 15),
(16, 'Win', 16, 16),
(17, 'Win', 17, 17),
(18, 'Win', 18, 18),
(19, 'Win', 19, 19),
(20, 'Win', 20, 20);

-- Region 및 City 데이터 생성
INSERT INTO region (region_id, name) VALUES
(6, 'Kalos'),
(7, 'Alola'),
(8, 'Galar'),
(9, 'Hisui'),
(10, 'Lental');

INSERT INTO city (city_id, name, region_region_id) VALUES
(11, 'Santalune City', 6),
(12, 'Konikoni City', 7),
(13, 'Wyndon', 8),
(14, 'Diamond Domain', 9),
(15, 'Belusylva', 10);

-- Shop 데이터 생성
INSERT INTO shop (shop_id, name, location, city_city_id) VALUES
(11, 'Poke Mart', 'Main Street', 11),
(12, 'Poke Center', 'Beachfront Avenue', 12),
(13, 'Battle Tower', 'Victory Road', 13),
(14, 'Fossil Research Lab', 'Mountain Peak', 14),
(15, 'Cafe Master', 'Forest Grove', 15);

-- Trade 데이터 생성
INSERT INTO trade (t_id, t_date, total_price, player_player_id, shop_shop_id, region_region_id) VALUES
(11, '2024-05-03 09:30:00', 500, 11, 11, 6),
(12, '2024-05-03 10:00:00', 1000, 12, 12, 7),
(13, '2024-05-03 10:30:00', 1500, 13, 13, 8),
(14, '2024-05-03 11:00:00', 2000, 14, 14, 9),
(15, '2024-05-03 11:30:00', 2500, 15, 15, 10),
(16, '2024-05-03 12:00:00', 3000, 16, 11, 6),
(17, '2024-05-03 12:30:00', 3500, 17, 12, 7),
(18, '2024-05-03 13:00:00', 4000, 18, 13, 8),
(19, '2024-05-03 13:30:00', 4500, 19, 14, 9),
(20, '2024-05-03 14:00:00', 5000, 20, 15, 10);

-- Buy 데이터 생성
INSERT INTO buy (b_id, b_date, price, player_player_id, item_item_id) VALUES
(11, '2024-05-03 09:30:00', 100, 11, 11),
(12, '2024-05-03 10:00:00', 200, 12, 12),
(13, '2024-05-03 10:30:00', 300, 13, 13),
(14, '2024-05-03 11:00:00', 400, 14, 14),
(15, '2024-05-03 11:30:00', 500, 15, 15),
(16, '2024-05-03 12:00:00', 600, 16, 16),
(17, '2024-05-03 12:30:00', 700, 17, 17),
(18, '2024-05-03 13:00:00', 800, 18, 18),
(19, '2024-05-03 13:30:00', 900, 19, 19),
(20, '2024-05-03 14:00:00', 1000, 20, 20);

-- Buy Cancellation 데이터 생성
INSERT INTO buycan (can_id, can_date, reason, buy_b_id) VALUES
(11, '2024-05-03 09:45:00', 'Changed my mind', 11),
(12, '2024-05-03 10:15:00', 'Item not needed', 12),
(13, '2024-05-03 10:45:00', 'Found a better deal', 13),
(14, '2024-05-03 11:15:00', 'Not as described', 14),
(15, '2024-05-03 11:45:00', 'Decided to save money', 15),
(16, '2024-05-03 12:15:00', 'Duplicate purchase', 16),
(17, '2024-05-03 12:45:00', 'Item damaged', 17),
(18, '2024-05-03 13:15:00', 'Ordered wrong item', 18),
(19, '2024-05-03 13:45:00', 'Item out of stock', 19),
(20, '2024-05-03 14:15:00', 'No longer needed', 20);

-- Trade Detail 데이터 생성
INSERT INTO tradedetail (detail_id, quantity, item_price, trade_t_id, item_item_id) VALUES
(11, 2, 300, 11, 11),
(12, 1, 400, 12, 12),
(13, 3, 500, 13, 13),
(14, 4, 600, 14, 14),
(15, 1, 700, 15, 15),
(16, 2, 800, 16, 16),
(17, 1, 900, 17, 17),
(18, 2, 1000, 18, 18),
(19, 3, 1100, 19, 19),
(20, 1, 1200, 20, 20);




-- 3. sql문 작성

-- 1) 모든 플레이어의 사용자명과 이메일 가져오기
SELECT username, email FROM player;

-- 2) 모든 포켓몬의 이름과 레벨 가져오기
SELECT name, level FROM pokemon;

-- 3) 모든 도시의 이름과 속한 지역의 이름 가져오기
SELECT City.name AS city_name, Region.name AS region_name
FROM City
INNER JOIN Region ON City.region_region_id = Region.region_id;

-- 4) 특정 플레이어가 보유한 아이템의 수량 가져오기
SELECT Item.name, Inventory.quantity
FROM Item
INNER JOIN Inventory ON Item.item_id = Inventory.item_item_id
WHERE Inventory.player_player_id = [플레이어 ID];

-- 5) 모든 전투 결과 중 승리한 전투의 수 가져오기
SELECT COUNT(*) AS win_count
FROM Battle
WHERE result = 'Win';

-- 6) 가장 많은 도시에서 이루어진 거래 총액 구하기
SELECT City.name, SUM(trade.total_price) AS total_sales
FROM City
INNER JOIN trade ON City.city_id = trade.shop_shop_id
GROUP BY City.name
ORDER BY total_sales DESC
LIMIT 1;

-- 7) 각 플레이어가 가진 포켓몬 수 세기
SELECT player.username, COUNT(*) AS pokemon_count
FROM player
INNER JOIN pokemon ON player.player_id = pokemon.player_player_id
GROUP BY player.username;

-- 8) 모든 구매 취소 사유 가져오기
SELECT reason FROM buycan;

-- 9) 가장 경험치가 높은 포켓몬의 이름과 경험치 가져오기
SELECT name, exp AS experience FROM pokemon ORDER BY exp DESC LIMIT 1;

-- 10) 각 지역의 도시 수 세기
SELECT Region.name, COUNT(*) AS city_count
FROM Region
INNER JOIN City ON Region.region_id = City.region_region_id
GROUP BY Region.name;

-- 11) 모든 포켓몬의 속성과 특성 가져오기
SELECT type, ability FROM pokemon;

-- 12) 모든 거래의 총 가격과 거래 일시 가져오기
SELECT total_price, t_date AS transaction_date FROM trade;

-- 13) 특정 도시에서 이루어진 거래 중 최근 거래 일시 가져오기
SELECT MAX(t_date) AS latest_transaction
FROM trade
WHERE shop_shop_id = [도시 ID];

-- 14) 모든 구매된 아이템의 가격과 수량 가져오기
SELECT Item.name, buy.price, tradedetail.quantity
FROM Item
INNER JOIN tradedetail ON Item.item_id = tradedetail.item_item_id
INNER JOIN trade ON tradedetail.trade_t_id = trade.t_id;

-- 15) 모든 포켓몬의 공격력 평균 구하기
SELECT AVG(attack) AS average_attack FROM pokemon;

-- 16) 가장 많은 포켓몬을 보유한 플레이어 찾기
SELECT player.username, COUNT(*) AS pokemon_count
FROM player
INNER JOIN pokemon ON player.player_id = pokemon.player_player_id
GROUP BY player.username
ORDER BY pokemon_count DESC
LIMIT 1;

-- 17) 특정 아이템을 가장 많이 구매한 플레이어 찾기
SELECT player.username, COUNT(*) AS purchase_count
FROM player
INNER JOIN buy ON player.player_id = buy.player_player_id
WHERE buy.item_item_id = [아이템 ID]
GROUP BY player.username
ORDER BY purchase_count DESC
LIMIT 1;

-- 18) 모든 포켓몬의 평균 레벨 구하기
SELECT AVG(level) AS average_level FROM pokemon;

-- 19) 각 플레이어의 전투 승리 횟수 구하기
SELECT player.username, COUNT(*) AS win_count
FROM player
INNER JOIN battle ON player.player_id = battle.player_player_id
WHERE battle.result = 'Win'
GROUP BY player.username;

-- 20) 모든 거래의 평균 가격 구하기
SELECT AVG(total_price) AS average_price FROM trade;

-- 21) 각 플레이어가 보유한 포켓몬의 이름과 레벨, 속성 가져오기
SELECT Player.username, Pokemon.name, Pokemon.level, Pokemon.type
FROM Player
INNER JOIN Pokemon ON Player.player_id = Pokemon.player_id;

-- 22) 특정 포켓몬을 보유한 모든 플레이어의 사용자명과 이메일 가져오기
SELECT player.username, player.email
FROM player
INNER JOIN pokemon ON player.player_id = pokemon.player_player_id
WHERE pokemon.name = 'Charmander';

-- 23) 모든 전투의 결과와 포켓몬 이름 가져오기
SELECT Battle.result, Pokemon.name
FROM Battle
INNER JOIN Pokemon ON Battle.pokemon_id = Pokemon.pokemon_id;

-- 24) 특정 포켓몬이 가진 스킬의 이름과 속성 가져오기
SELECT pokemon.name AS pokemon_name, skill.name AS skill_name, skill.type AS skill_type
FROM pokemon
INNER JOIN skill ON pokemon.pokemon_id = skill.pokemon_pokemon_id
WHERE pokemon.name = 'Pikachu';

-- 25) 각 도시별로 가장 높은 가격의 거래 상세 정보 가져오기
SELECT City.name AS city_name, Item.name AS item_name, MAX(TransactionDetail.item_price) AS max_price
FROM City
INNER JOIN Transaction ON City.city_id = Transaction.shop_id
INNER JOIN TransactionDetail ON Transaction.transaction_id = TransactionDetail.transaction_id
INNER JOIN Item ON TransactionDetail.item_id = Item.item_id
GROUP BY City.name;

-- 26) 포켓몬의 수량이 5마리 이상인 플레이어의 사용자명과 포켓몬 수량 가져오기
SELECT Player.username, COUNT(*) AS pokemon_count
FROM Player
INNER JOIN Pokemon ON Player.player_id = Pokemon.player_id
GROUP BY Player.username
HAVING COUNT(*) >= 5;

-- 27) 가장 많은 포켓몬을 보유한 플레이어의 사용자명과 포켓몬 수량 가져오기
SELECT Player.username, COUNT(*) AS pokemon_count
FROM Player
INNER JOIN Pokemon ON Player.player_id = Pokemon.player_id
GROUP BY Player.username
ORDER BY pokemon_count DESC
LIMIT 1;

-- 28) 전투 결과가 승리이고 포켓몬 레벨이 50 이상인 포켓몬의 이름과 레벨 가져오기
SELECT Pokemon.name, Pokemon.level
FROM Battle
INNER JOIN Pokemon ON Battle.pokemon_id = Pokemon.pokemon_id
WHERE Battle.result = 'Win' AND Pokemon.level >= 50;

-- 29) 가장 많은 구매를 한 플레이어의 사용자명과 구매 수량 가져오기
SELECT Player.username, COUNT(*) AS purchase_count
FROM Player
INNER JOIN Purchase ON Player.player_id = Purchase.player_id
GROUP BY Player.username
ORDER BY purchase_count DESC
LIMIT 1;

-- 30) 각 지역별로 가장 많은 도시에서 이루어진 거래 총액 가져오기
SELECT Region.name AS region_name, City.name AS city_name, SUM(Transaction.total_price) AS total_sales
FROM Region
INNER JOIN City ON Region.region_id = City.region_id
INNER JOIN Transaction ON City.city_id = Transaction.shop_id
GROUP BY Region.name
ORDER BY total_sales DESC;

-- 31) 각 플레이어가 보유한 포켓몬의 총 경험치 합계 구하기
SELECT Player.username, SUM(Pokemon.exp) AS total_experience
FROM Player
INNER JOIN Pokemon ON Player.player_id = Pokemon.player_player_id
GROUP BY Player.username;

-- 32) 각 플레이어가 보유한 포켓몬 중 공격력이 가장 높은 포켓몬의 이름과 공격력 가져오기
SELECT Player.username, MAX(Pokemon.attack) AS max_attack
FROM Player
INNER JOIN Pokemon ON Player.player_id = Pokemon.player_player_id
GROUP BY Player.username;

-- 33) 각 플레이어가 보유한 포켓몬 중 레벨이 가장 높은 포켓몬의 이름과 레벨 가져오기
SELECT Player.username, MAX(Pokemon.level) AS max_level
FROM Player
INNER JOIN Pokemon ON Player.player_id = Pokemon.player_player_id
GROUP BY Player.username;

-- 34) 각 플레이어가 보유한 포켓몬 중 체력이 가장 낮은 포켓몬의 이름과 체력 가져오기
SELECT Player.username, MIN(Pokemon.hp) AS min_hp
FROM Player
INNER JOIN Pokemon ON Player.player_id = Pokemon.player_player_id
GROUP BY Player.username;

-- 35) 각 플레이어가 보유한 포켓몬 중 방어력이 가장 높은 포켓몬의 이름과 방어력 가져오기
SELECT Player.username, MAX(Pokemon.defense) AS max_defense
FROM Player
INNER JOIN Pokemon ON Player.player_id = Pokemon.player_player_id
GROUP BY Player.username;

-- 36) 각 플레이어가 보유한 포켓몬 중 속성이 불(Fire)인 포켓몬의 수 세기
SELECT Player.username, COUNT(Pokemon.type) AS fire_type_count
FROM Player
INNER JOIN Pokemon ON Player.player_id = Pokemon.player_player_id
WHERE Pokemon.type = 'Fire'
GROUP BY Player.username;

-- 37) 각 플레이어가 보유한 포켓몬 중 레벨이 50 이상인 포켓몬의 수 세기
SELECT Player.username, COUNT(Pokemon.level) AS level_50_or_above_count
FROM Player
INNER JOIN Pokemon ON Player.player_id = Pokemon.player_player_id
WHERE Pokemon.level >= 50
GROUP BY Player.username;

-- 38) 포켓몬을 보유한 플레이어 중 레벨이 50 이상인 포켓몬을 보유한 플레이어 찾기
SELECT username
FROM Player p
WHERE EXISTS (
    SELECT 1
    FROM Pokemon po
    WHERE po.player_player_id = p.player_id
    AND po.level >= 50
);

-- 39) 아이템을 보유한 플레이어 중 특정 아이템을 보유하지 않은 플레이어 찾기
SELECT username
FROM Player p
WHERE NOT EXISTS (
    SELECT 1
    FROM Inventory inv
    WHERE inv.player_player_id = p.player_id
    AND inv.item_item_id = [특정 아이템 ID]
);

-- 40) 특정 지역에 속한 도시가 있는 경우 해당 지역에 속한 모든 도시를 출력하기
SELECT name
FROM City c
WHERE EXISTS (
    SELECT 1
    FROM Region r
    WHERE r.region_id = c.region_region_id
    AND r.name = '특정 지역 이름'
);

-- 41) 모든 도시가 포함된 지역을 찾기
SELECT name
FROM Region r
WHERE NOT EXISTS (
    SELECT 1
    FROM City c
    WHERE c.region_region_id = r.region_id
);

-- 42) 보유한 포켓몬 중 공격력이 특정 값보다 높은 포켓몬을 가진 플레이어 찾기
SELECT username
FROM Player p
WHERE EXISTS (
    SELECT 1
    FROM Pokemon po
    WHERE po.player_player_id = p.player_id
    AND po.attack > [특정 값]
);