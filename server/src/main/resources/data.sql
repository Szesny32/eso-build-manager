INSERT INTO item_category(item_category_name)
VALUES ('Weapons');

INSERT INTO item_type(item_type_name, item_category_id)
VALUES ('Two-Handed Melee', (SELECT item_category_id from item_category where item_category_name='Weapons'));

INSERT INTO item_subtype (item_subtype_name, item_category_id, item_type_id)
VALUES ('Axe', (SELECT item_category_id from item_category where item_category_name='Weapons'), (SELECT item_type_id from item_type where item_type_name='Two-Handed Melee'));

INSERT INTO item_subtype (item_subtype_name, item_category_id, item_type_id)
VALUES ('Mace', (SELECT item_category_id from item_category where item_category_name='Weapons'), (SELECT item_type_id from item_type where item_type_name='Two-Handed Melee'));
