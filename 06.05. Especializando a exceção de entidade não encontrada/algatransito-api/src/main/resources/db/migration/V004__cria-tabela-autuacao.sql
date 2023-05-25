create table autuacao (
	id bigint not null auto_increment,
    veiculo_id bigint not null,
    descricao text not null,
    valor_multa decimal(10,2) not null,
    data_ocorrencia datetime not null,

    primary key (id)
);

alter table autuacao add constraint fk_autuacao_veiculo
foreign key (veiculo_id) references veiculo (id);