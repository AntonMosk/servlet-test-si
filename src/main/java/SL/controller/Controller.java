package SL.controller;

import SL.ViewModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by anton on 3/14/17.
 */
public interface Controller {
    ViewModel process(HttpServletRequest request, HttpServletResponse response);
}
