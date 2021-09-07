package com.mcnz

public class uatInput {

  def buildIsUatApproved() {
    def file = new File("D:/jenkins.war")
    
    if (file.exists()){
      return true;
    }
    else {
      println "Approval file does not exist."
    }
    
    return false;
  }

}
