package com.learning.programming;

import java.util.HashSet;
import java.util.List;

public class Checking {
    public static void main(String[] args) {
        var a = List.of("eklms.fusionx.gql.profile.retrieve.contact",
            "eklms.fusionx.gql.profile.retrieve.contactEmail",
            "eklms.fusionx.gql.profile.retrieve.customerSecretInfo",
            "eklms.fusionx.gql.profile.retrieve.basicDetails",
            "eklms.fusionx.gql.profile.retrieve.extended",
            "eklms.fusionx.gql.profile.retrieve.basicDetails",
            "eklms.fusionx.gql.profile.retrieve.basicDetails",
            "eklms.fusionx.gql.profile.retrieve.basicDetails",
            "eklms.fusionx.gql.profile.retrieve.sensitiveDOB",
            "eklms.fusionx.gql.profile.retrieve.sensitiveGender",
            "eklms.fusionx.gql.profile.retrieve.extended",
            "eklms.fusionx.gql.profile.retrieve.contact",
            "eklms.fusionx.gql.profile.retrieve.contactCountry",
            "eklms.fusionx.gql.profile.retrieve.contact",
            "eklms.fusionx.gql.profile.retrieve.contactCountry",
            "eklms.fusionx.gql.profile.retrieve.contactEmail",
            "eklms.fusionx.gql.profile.retrieve.contactCountry",
            "eklms.fusionx.gql.profile.retrieve.contact",
            "eklms.fusionx.gql.profile.retrieve.contact",
            "eklms.fusionx.gql.profile.retrieve.contact",
            "eklms.fusionx.gql.profile.retrieve.contact",
            "eklms.fusionx.gql.profile.retrieve.contact",
            "eklms.fusionx.gql.profile.retrieve.contact",

            "eklms.fusionx.gql.profile.retrieve.partnerProductTypes",
            "eklms.fusionx.gql.profile.retrieve.partnerProducts",
            "eklms.fusionx.gql.profile.retrieve.partnerProductTypes",

            "eklms.fusionx.gql.profile.retrieve.extended",

            "eklms.fusionx.gql.profile.retrieve.basicDetails",

            "eklms.fusionx.gql.profile.retrieve.tier",
            "eklms.fusionx.gql.profile.retrieve.milesBalance",

            "eklms.fusionx.gql.profile.retrieve.family",
            "eklms.fusionx.gql.profile.retrieve.family",
            "eklms.fusionx.gql.profile.retrieve.family");
        var b = new HashSet<String>(a);
        for(var c : b){
            System.out.println(c);
        }
    }
}
