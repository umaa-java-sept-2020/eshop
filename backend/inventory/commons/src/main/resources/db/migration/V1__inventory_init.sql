CREATE TABLE TBL_ITEM
(
ID INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(256),
DESCRIPTION TEXT,
UNIT_PRICE DOUBLE,
MAX_ORDER_QTY INT DEFAULT 1,
VISIBILITY TINYINT(1)
);

CREATE TABLE TBL_GALLERY
(
ID INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(256) UNIQUE,
DESCRIPTION TEXT
);

CREATE TABLE TBL_GALLERY_IMAGE
(
ID INT PRIMARY KEY AUTO_INCREMENT,
GALLERY_ID INT,
IMAGE_PATH TEXT,
DISPLAY_ORDER INT,
FOREIGN KEY (GALLERY_ID) REFERENCES TBL_GALLERY(ID)
);

CREATE TABLE TBL_ITEM_GALLERY
(
ID INT PRIMARY KEY AUTO_INCREMENT,
ITEM_ID INT,
GALLERY_ID INT,
FOREIGN KEY (GALLERY_ID) REFERENCES TBL_GALLERY(ID),
FOREIGN KEY (ITEM_ID) REFERENCES TBL_ITEM(ID),
CONSTRAINT UK_ITEM_GALLERY UNIQUE (ITEM_ID,GALLERY_ID)
);
