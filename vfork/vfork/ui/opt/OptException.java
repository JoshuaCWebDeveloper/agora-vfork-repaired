
/*
 * Copyright 2008 2009 2010 Douglas Wikstrom
 *
 * This file is part of Vfork.
 *
 * Vfork is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * Vfork is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Vfork.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package vfork.ui.opt;

/**
 * Thrown when an option handling exception occurs. This exception
 * should normally be caught. The message string of this exception
 * normally contains a description that can be output directly to the
 * user.
 *
 * @author Douglas Wikstrom
 */
public class OptException extends Exception {

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param message Detailed message of the problem.
     */
    public OptException(String message) {
        super(message);
    }

    /**
     * Constructs a new exception with the specified detail message
     * and cause.
     *
     * @param message Detailed message of the problem.
     * @param cause What caused this exception to be thrown.
     */
    public OptException(String message, Throwable cause) {
        super(message, cause);
    }
}
