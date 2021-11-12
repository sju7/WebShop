CREATE TABLE TICKET (
    TicketId int IDENTITY(1,1) PRIMARY KEY,
    TicketPrice int,
    TicketLocation varchar(100),
    TicketClass varchar(100),
    TicketStatus varchar(100),
    TickedReservedStart TIMESTAMP
);

CREATE TABLE shedlock (
  name VARCHAR(64),
  lock_until TIMESTAMP(3) NULL,
  locked_at TIMESTAMP(3) NULL,
  locked_by VARCHAR(255),
  PRIMARY KEY (name)
)