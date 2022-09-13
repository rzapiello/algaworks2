insert into cozinha (id,nome) values (1,'Tailandesa');
insert into cozinha (id,nome) values (2,'Indiana');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Gourmet', '10',1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Delivery', '9.5',2);
--insert into restaurante (nome, taxa_frete, cozinha_id) values ('Tuk Tuk Comida Indiana', '15',2);

insert into estado (id,nome) values (1,'Sao Paulo');
insert into estado (id,nome) values (2,'Rio de Janneiro');

insert into cidade (nome,estado_id) values ('Santos',1);
insert into cidade (nome,estado_id) values ('Buzios',2);


insert into permissao (nome,descricao) values ('permissaonome1','permissaodescricao1');
insert into permissao (nome,descricao) values ('permissaonome2','permissaodescricao2');

insert into forma_pagamento (descricao) values ('Cartao de crédito');
insert into forma_pagamento (descricao) values ('Cartao de debito');
--insert into forma_pagamento (descricao) values ('dinheiro');

