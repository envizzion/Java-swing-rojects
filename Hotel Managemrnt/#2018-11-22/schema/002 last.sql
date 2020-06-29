SELECT room.idroom,room_no,category_one_name,category_two_name,room.beds,sum(cat_level_one.price + cat_level_two.price+basicPrice) AS price FROM room,cat_level_one ,cat_level_two 
WHERE room.status='Active' AND room.cat_level_one_idcat_level_one=cat_level_one.idcat_level_one
AND room.cat_level_two_idcat_level_two=cat_level_two.idcat_level_twotablestables


;

/*cat_level_one.idcat_level_one=room.cat_level_one_idcat_level_one
AND cat_level_two.idcat_level_two=room.cat_level_two_idcat_level_two*/