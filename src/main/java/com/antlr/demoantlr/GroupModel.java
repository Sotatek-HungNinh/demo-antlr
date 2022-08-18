package com.antlr.demoantlr;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GroupModel {
    private String cddl;
    private List<String> rule_1 = new ArrayList<>();
    private String typename;
    private String groupname;
    private String assignt;
    private String assigng;
    private String genericparm;
    private String genericarg;
    private String type;
    private String type1;
    private String type2;
    private String rangeop;
    private String ctlop;
    private String group;
    private String grpchoice;
    private String grpent;
    private List<MemberModel> memberModels = new ArrayList<>();
    private String bareword;
    private String optcom;
    private String occur;
    private String uint_1;
    private String value;
    private String int_1;
    private String number;
    private String hexfloat;
    private String fraction;
    private String exponent;
    private String text;
    private String schar;
    private String sesc;
    private String bytes;
    private String bchar;
    private String bsqual;
    private String id;
    private String alpha;
    private String ealpha;
    private String digit;
    private String digit1;
    private String hexdig;
    private String bindig;
    private String comment;
}
