package br.com.projetoibm.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdenarTimesService {

  public static Map<String, List<String>> organizarTimes(List<String> players) {

    Map<String, List<String>> teams = new HashMap<>();

    /*Magical Label... don`t move... not a good practice
    Here my humble thanks for everyone who helped*/
    BreakConditional:
    for (String addPlayer : players) {

      List<String> list = List.of(addPlayer.split(" "));

      String lastName = String.valueOf(list.get(1));
      String firstLetterLastname = String.valueOf(lastName.charAt(0));

      List<String> groupName = teams.get(firstLetterLastname);

      if (!teams.containsKey(firstLetterLastname)) {

        teams.put(firstLetterLastname, new ArrayList<>());
        teams.get(firstLetterLastname).add(addPlayer);

      } else {

        for (String sameLastname : groupName) {

          if (sameLastname.endsWith(lastName)) {

            teams.put(lastName, new ArrayList<>());
            teams.get(lastName).add(addPlayer);

            /*Magical label... don't move...
            It tells the If Statement that when the condition is completed,
            it should leave the loop marked*/
            continue BreakConditional;
          }

        }

        teams.get(firstLetterLastname).add(addPlayer);

      }

    }

    return teams;
  }

}
