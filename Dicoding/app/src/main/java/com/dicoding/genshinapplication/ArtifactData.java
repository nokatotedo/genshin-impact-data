package com.dicoding.genshinapplication;

import java.util.ArrayList;

public class ArtifactData {
    public static String[] artifactName = {
            "Clear Pool and Mountain Cavern",
            "Domain of Guyun",
            "Hidden Palace of Zhou Formula",
            "Midsummer Courtyard",
            "Momiji-Dyed Court",
            "Peak of Vindagnyr",
            "Ridge Watch",
            "Slumbering Court",
            "Valley of Remembrance"
    };

    public static String[] artifactNameOne = {
            "Bloodstained Chivalry",
            "Archaic Petra",
            "Crimson Witch of Flames",
            "Thundering Fury",
            "Shimenawa's Reiminiscence",
            "Blizzard Strayer",
            "Tenacity of the Millelith",
            "Husk of Opulent Dreams",
            "Viridescent Venerer"
    };

    public static String[] artifactDetailOne = {
            "2-Piece Bonus : Physical DMG +25%\n" +
                    "4-Piece Bonus : After defeating an opponent, increases Charged Attack DMG by 50%, and reduces its Stamina cost to 0 for 10s. Also triggers with wild animals such as boars, squirrels and frogs.",
            "2-Piece Bonus : Geo DMG Bonus +15%\n" +
                    "4-Piece Bonus : Upon obtaining an Elemental Shard created through a Crystallize Reaction, all party members gain 35% DMG Bonus for that particular element for 10s. Only one form of Elemental DMG Bonus can be gained in this manner at any one time.",
            "2-Piece Bonus : Pyro DMG Bonus +15%\n" +
                    "4-Piece Bonus : Increases Overloaded and Burning DMG by 40%. Increases Vaporize and Melt DMG by 15%. Using an Elemental Skill increases the 2-Piece Set Bonus by 50% of its starting value for 10s. Max 3 stacks.",
            "2-Piece Bonus : Electro DMG Bonus +15%\n" +
                    "4-Piece Bonus : Increases damage caused by Overloaded, Electro-Charged and Superconduct by 40%. Triggering such effects decreases Elemental Skill CD by 1s. Can only occur once every 0.8s.",
            "2-Piece Bonus : ATK +18%\n" +
                    "4-Piece Bonus : When casting an Elemental Skill, if the character has 15 or more Energy, they lose 15 Energy and Normal/Charged/Plunging Attack DMG is increased by 50% for 10s. This effect will not trigger again during that duration.",
            "2-Piece Bonus : Cryo DMG Bonus +15%\n" +
                    "4-Piece Bonus : When a character attacks an opponent affected by Cryo, their CRIT Rate is increased by 20%. If the opponent is Frozen, CRIT Rate is increased by an additional 20%",
            "2-Piece Bonus : HP +20%\n" +
                    "4-Piece Bonus : When an Elemental Skill hits an opponent, the ATK of all nearby party members is increased by 20% and their Shield Strength is increased by 30% for 3s. This effect can be triggered once every 0.5s. This effect can still be triggered even when the character who is using this artifact set is not on the field.",
            "2-Piece Bonus : DEF 30%\n" +
                    "4-Piece Bonus : A character equipped with this Artifact set will obtain the Curiosity effect in the following conditions: When on the field, the character gains 1 stack after hitting an opponent with a Geo attack, triggering a maximum of once every 0.3s.\n" +
                    "When off the field, the character gains 1 stack every 3s. Curiosity can stack up to 4 times, each providing 6% DEF and a 6% Geo DMG Bonus. When 6 seconds pass without gaining a Curiosity stack, 1 stack is lost.",
            "2-Piece Bonus : Anemo DMG Bonus +15%\n" +
                    "4-Piece Bonus : Increases Swirl DMG by 60%. Decreases opponent's Elemental RES to the element infused in the Swirl by 40% for 10s."
    };

    public static String[] artifactNameTwo = {
            "Noblesse Oblige",
            "Retracing Bolide",
            "Lavawalker",
            "Thundersoother",
            "Emblem of Severed Fate",
            "Heart of Depth",
            "Pale Flame",
            "Ocean-Hued Clam",
            "Maiden Beloved"
    };

    public static String[] artifactDetailTwo = {
            "2-Piece Bonus : Elemental Burst DMG +20%\n" +
                    "4-Piece Bonus : Using an Elemental Burst increases all party members' ATK by 20% for 12s. This effect cannot stack.",
            "2-Piece Bonus : Increases Shield Strength by 35%\n" +
                    "4-Piece Bonus : While protected by a shield, gain an additional 40% Normal and Charged Attack DMG.",
            "2-Piece Bonus : Pyro RES increased by 40%\n" +
                    "4-Piece Bonus : Increases DMG against opponents affected by Pyro by 35%",
            "2-Piece Bonus : Electro RES increased by 40%\n" +
                    "4-Piece Bonus : Increases DMG against opponents affected by Electro by 35%",
            "2-Piece Bonus : Energy Recharge +20%\n" +
                    "4-Piece Bonus : Increases Elemental Burst DMG by 25% of Energy Recharge. A maximum of 75% bonus DMG can be obtained in this way.",
            "2-Piece Bonus : Hydro DMG Bonus +15%\n" +
                    "4-Piece Bonus : After using an Elemental Skill, increases Normal Attack and Charged Attack DMG by 30% for 15s.",
            "2-Piece Bonus : Physical DMG +25%\n" +
                    "4-Piece Bonus : When an Elemental Skill hits an opponent, ATK is increased by 9% for 7s. This effect stacks up to 3 times and can be triggered once every 0.3s. Once 3 stacks are reached, the 2-set effect is increased by 100%",
            "2-Piece Bonus : Healing Bonus +15%\n" +
                    "4-Piece Bonus : When the character equipping this artifact set heals a character in the party, a Sea-Dyed Foam will appear for 3 seconds, accumulating the amount of HP recovered from healing (including overflow healing).\n" +
                    "At the end of the duration, the Sea-Dyed Foam will explode, dealing DMG to nearby opponents based on 90% of the accumulated healing.\n" +
                    "(This DMG is calculated similarly to Reactions such as Electro-Charged, and Superconduct, but it is not affected by Elemental Mastery, Character Levels, or Reaction DMG Bonuses).\n" +
                    "Only one Sea-Dyed Foam can be produced every 3.5 seconds.\n" +
                    "Each Sea-Dyed Foam can accumulate up to 30,000 HP (including overflow healing).\n" +
                    "There can be no more than one Sea-Dyed Foam active at any given time.\n" +
                    "This effect can still be triggered even when the character who is using this artifact set is not on the field.",
            "2-Piece Bonus : Character Healing Effectiveness +15%\n" +
                    "4-Piece Bonus : Using an Elemental Skill or Burst increases healing received by all party members by 20% for 10s."
    };

    public static String[] artifactDomain = {
            "Liyue",
            "Liyue",
            "Liyue",
            "Mondstadt",
            "Inazuma",
            "Mondstadt",
            "Liyue",
            "Inazuma",
            "Mondstadt"
    };

    public static int[] artifactCard = {
            R.drawable.clearpoolandmountaincavern,
            R.drawable.domainofguyun,
            R.drawable.hiddenplaceofzhouformula,
            R.drawable.midsummercourtyard,
            R.drawable.momijidyedcourt,
            R.drawable.peakofvindagnyr,
            R.drawable.ridgewatch,
            R.drawable.slumberingcourt,
            R.drawable.valleyofremembrance
    };

    public static int[] artifactA = {
            R.drawable.bloodstainedchivalry_1,
            R.drawable.archaicpetra_1,
            R.drawable.crimsonwitchofflames_1,
            R.drawable.thunderingfury_1,
            R.drawable.shimenawasreminiscence_1,
            R.drawable.blizzardstrayer_1,
            R.drawable.tenacityofthemillelith_1,
            R.drawable.huskofopulentdreams_1,
            R.drawable.viridescentvenerer_1
    };

    public static int[] artifactB = {
            R.drawable.bloodstainedchivalry_2,
            R.drawable.archaicpetra_2,
            R.drawable.crimsonwitchofflames_2,
            R.drawable.thunderingfury_2,
            R.drawable.shimenawasreminiscence_2,
            R.drawable.blizzardstrayer_2,
            R.drawable.tenacityofthemillelith_2,
            R.drawable.huskofopulentdreams_2,
            R.drawable.viridescentvenerer_2
    };

    public static int[] artifactC = {
            R.drawable.noblesseoblige_3,
            R.drawable.retracingbolide_3,
            R.drawable.lavawalker_3,
            R.drawable.thundersoother_3,
            R.drawable.emblemofseveredfate_3,
            R.drawable.heartofdepth_3,
            R.drawable.paleflame_3,
            R.drawable.oceanhuedclam_3,
            R.drawable.maidenbeloved_3
    };

    public static int[] artifactD = {
            R.drawable.noblesseoblige_4,
            R.drawable.retracingbolide_4,
            R.drawable.lavawalker_4,
            R.drawable.thundersoother_4,
            R.drawable.emblemofseveredfate_4,
            R.drawable.heartofdepth_4,
            R.drawable.paleflame_4,
            R.drawable.oceanhuedclam_4,
            R.drawable.maidenbeloved_4
    };

    static ArrayList<Artifact> getListData() {
        ArrayList<Artifact> list = new ArrayList<>();
        for(int position = 0; position < artifactName.length; position++) {
            Artifact artifact = new Artifact();
            artifact.setName(artifactName[position]);
            artifact.setArtifactOne(artifactNameOne[position]);
            artifact.setDetailArtifactOne(artifactDetailOne[position]);
            artifact.setArtifactTwo(artifactNameTwo[position]);
            artifact.setDetailArtifactTwo(artifactDetailTwo[position]);
            artifact.setDomain(artifactDomain[position]);
            artifact.setCard(artifactCard[position]);
            artifact.setArtifacta(artifactA[position]);
            artifact.setArtifactb(artifactB[position]);
            artifact.setArtifactc(artifactC[position]);
            artifact.setArtifactd(artifactD[position]);
            list.add(artifact);
        }
        return list;
    }
}