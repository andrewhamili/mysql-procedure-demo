package com.andrewhamili.mysqlproceduredemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.MappedSuperclass;
import javax.persistence.SqlResultSetMapping;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@MappedSuperclass
@SqlResultSetMapping(name = "UserSummary", classes = @ConstructorResult(targetClass = UserSummary.class, columns = {
        @ColumnResult(name = "id", type = Long.class),
        @ColumnResult(name = "uid", type = String.class),
        @ColumnResult(name = "leadUserId", type = Long.class),
        @ColumnResult(name = "leadName", type = String.class),
        @ColumnResult(name = "firstName", type = String.class),
        @ColumnResult(name = "emailAddress", type = String.class),
        @ColumnResult(name = "emailVerified", type = Integer.class),
        @ColumnResult(name = "phoneNumber", type = String.class),
        @ColumnResult(name = "photoUrl", type = String.class),
        @ColumnResult(name = "disabled", type = Integer.class),
        @ColumnResult(name = "dateEntry", type = Date.class),
        @ColumnResult(name = "dateLastLogin", type = Date.class),
        @ColumnResult(name = "userAccountId", type = Long.class),
        @ColumnResult(name = "roleId", type = Integer.class),
        @ColumnResult(name = "accountNumber", type = String.class),
        @ColumnResult(name = "googleDriveFolderId", type = String.class),
        @ColumnResult(name = "active", type = Integer.class),
        @ColumnResult(name = "userAccountDateEntry", type = Date.class)
}))
public class UserSummary {
    private Long id;
    private String uid;
    private Long leadUserId;
    private String leadName;
    private String firstName;
    private String emailAddress;
    private Integer emailVerified;
    private String phoneNumber;
    private String photoUrl;
    private Integer disabled;
    private Date dateEntry;
    private Date dateLastLogin;
    private Long userAccountId;
    private Integer roleId;
    private String accountNumber;
    private String googleDriveFolderId;
    private Integer active;
    private Date userAccountDateEntry;
}
