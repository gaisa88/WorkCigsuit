package com.workcigsuit.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "c_ge_IdNumber")
public class IdNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private int id;
    @Column(name = "CreditinfoId")
    private int CreditinfoId;
    @Column(name = "Number")
    private String Number;
    @Column(name = "TypeId")
    private int TypeId;
    @Column(name = "Rank")
    private int Rank;
    @Column(name = "RegistrationDate")
    private String RegistrationDate;
    @Column(name = "IssueDate")
    private String IssueDate;
    @Column(name = "ExpirationDate")
    private String ExpirationDate;
    @Column(name = "LocationId")
    private int LocationId;
    @Column(name = "ProviderId")
    private int ProviderId;
    @Column(name = "Inserted")
    private String Inserted;
    @Column(name = "InsertedBy")
    private int InsertedBy;
    @Column(name = "Updated")
    private String Updated;
    @Column(name = "UpdatedBy")
    private int UpdatedBy;
    @Column(name = "is_confirm")
    private int is_confirm;
    @Column(name = "is_rnn")
    private int is_rnn;
    @Column(name = "KatoId")
    private String KatoId;
    @Column(name = "type_free")
    private String type_free;

    @Override
    public String toString() {// переопределение метода toString для вывода данных в json
        return String.format(
                "IdNumber[id=%d, CreditinfoId='%d', Number='%s', TypeId='%d', Rank=%d, RegistrationDate='%s', IssueDate='%s', ExpirationDate='%s', LocationId=%d, ProviderId='%d', Inserted='%s', InsertedBy='%d', Updated=%s, UpdatedBy='%d', is_confirm='%d', is_rnn='%d', KatoId='%s', type_free='%s' ]",
                id, CreditinfoId, Number, TypeId, Rank, RegistrationDate, IssueDate, ExpirationDate, LocationId, ProviderId, Inserted, InsertedBy, Updated, UpdatedBy, is_confirm, is_rnn, KatoId, type_free);
    }
}
