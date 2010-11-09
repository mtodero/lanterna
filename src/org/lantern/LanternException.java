/*
 *  Copyright (C) 2010 mabe02
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.lantern;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 * @author mabe02
 */
public class LanternException extends Exception {
    private IOException cause;

    public LanternException(IOException cause)
    {
        super(cause.getMessage(), cause);
        this.cause = cause;
    }

    @Override
    public Throwable getCause()
    {
        return cause;
    }

    @Override
    public String getLocalizedMessage()
    {
        return cause.getLocalizedMessage();
    }

    @Override
    public String getMessage()
    {
        return cause.getMessage();
    }

    @Override
    public StackTraceElement[] getStackTrace()
    {
        return cause.getStackTrace();
    }

    @Override
    public void printStackTrace()
    {
        cause.printStackTrace();
    }

    @Override
    public void printStackTrace(PrintStream s)
    {
        cause.printStackTrace(s);
    }

    @Override
    public void printStackTrace(PrintWriter s)
    {
        cause.printStackTrace(s);
    }

    @Override
    public String toString()
    {
        return cause.toString();
    }
}