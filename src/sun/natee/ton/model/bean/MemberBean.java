/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sun.natee.ton.model.bean;

/**
 *
 * @author Installation-Laptop
 */
public class MemberBean {
    private String MemberCode = "";
    private String MemberName = "";
    private String MemberSurname = "";
    private String MemberGender = "";

    public String getMemberCode() {
        return MemberCode;
    }

    public void setMemberCode(String MemberCode) {
        this.MemberCode = MemberCode;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public String getMemberSurname() {
        return MemberSurname;
    }

    public void setMemberSurname(String MemberSurname) {
        this.MemberSurname = MemberSurname;
    }

    public String getMemberGender() {
        return MemberGender;
    }

    public void setMemberGender(String MemberGender) {
        this.MemberGender = MemberGender;
    }
    
}
