--------------------------------------------------------
--  DDL for Sequence CATEGORY_ID_SEQUENCE
--------------------------------------------------------
DROP SEQUENCE IF EXISTS CATEGORY_ID_SEQUENCE;
CREATE SEQUENCE  IF NOT EXISTS  CATEGORY_ID_SEQUENCE  MINVALUE 1 INCREMENT BY 1 START WITH 1;
--------------------------------------------------------

-------------CATEGORY (TRAINING MODULE)----------------
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Java', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'SQL', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Servlet', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'JSP', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'XML', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Git', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'JUnit', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Maven', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'JDBC', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'HTML', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'CSS', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'JavaScript', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'jQuery', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'AJAX', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'UNIX', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'AWS', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Jenkins', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Hibernate', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL,'Spring', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'SOAP', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'REST', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'AngularJS', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Selenium', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Cucumber', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'UFT', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Python', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Robot Framework', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'ALM', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'SDLC', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Agile', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Testing', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'VBScript', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'SOAP UI', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'TestNG', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Chef', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Docker', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Kafka', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Microservices', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'NoSQL', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'C#', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'ASP.NET', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'ADO.NET', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'Entity Framework', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'MSBuild', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'WPF', 1);
INSERT INTO CALIBER_CATEGORY(CATEGORY_ID, SKILL_CATEGORY, IS_ACTIVE) VALUES (CATEGORY_ID_SEQUENCE.NEXTVAL, 'WCF', 1);
-------------CATEGORY (TRAINING MODULE) END----------------
COMMIT;
