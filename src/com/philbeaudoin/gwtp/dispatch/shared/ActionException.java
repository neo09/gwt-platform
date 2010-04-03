package com.philbeaudoin.gwtp.dispatch.shared;

/**
 * Copyright 2010 Philippe Beaudoin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/**
 * These are thrown by {@link com.philbeaudoin.gwtp.dispatch.server.Dispatch#execute(Action)} if there is a
 * problem executing a particular {@link Action}.
 * 
 * @author David Peterson
 */
public class ActionException extends Exception {

  private static final long serialVersionUID = -1423773155541528952L;

  public ActionException() {
  }

  public ActionException( String message ) {
    super( message );
  }

  public ActionException( Throwable cause ) {
    super( cause.getMessage() );
  }

  public ActionException( String message, Throwable cause ) {
    super( message + " (" + cause.getMessage() + ")" );
  }

}
