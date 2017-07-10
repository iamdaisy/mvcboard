
/* Drop Tables */

DROP TABLE tb_article CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE seq_article;




/* Create Sequences */

CREATE SEQUENCE seq_article nocache;



/* Create Tables */

CREATE TABLE tb_article
(
	no number NOT NULL,
	name varchar2(20) NOT NULL,
	title varchar2(100) NOT NULL,
	content varchar2(4000) NOT NULL,
	pwd varchar2(128) NOT NULL,
	regdate date DEFAULT sysdate NOT NULL,
	viewcount number DEFAULT 0 NOT NULL,
	PRIMARY KEY (no)
);

select * from TB_ARTICLE;

select no, title, name, regdate, viewcount
from tb_article
order by no desc;


SELECT B.*
FROM (SELECT rownum AS rnum, A.*
		FROM (SELECT no, title, name, regdate, viewcount
				FROM tb_article
				ORDER BY no desc) A ) B
WHERE rnum between 11 and 20;

