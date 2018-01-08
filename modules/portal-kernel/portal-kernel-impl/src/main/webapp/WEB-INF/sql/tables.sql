create table Mail_CyrusUser (
	userId VARCHAR(75) not null primary key,
	password_ VARCHAR(75) null
);

create table Mail_CyrusVirtual (
	emailAddress VARCHAR(75) not null primary key,
	userId VARCHAR(75) null
);