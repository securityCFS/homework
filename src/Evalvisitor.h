#ifndef PYTHON_INTERPRETER_EVALVISITOR_H
#define PYTHON_INTERPRETER_EVALVISITOR_H


#include "Python3BaseVisitor.h"
#include "integer.h"
#include <cstring>
#include <map>
#include <iomanip>
using std::string;
const size_t max = 0xffffffff;
struct NoneExpr{
    const int dat = 0;
};
struct NameExpr{
    string Name;
};
struct Bre_ConExpr{
    bool type;
};
struct ReturnExpr{
    antlrcpp::Any value;
};
class ErrorArgument{};
class four_o_four_not_found{};
class bad_trans_option{};
class No_sign_matched{};
class to_many_arguments{};
class Parameter_undefined{};
class Cannot_connect_function{};
class Argument_does_not_match{};
//the place here is used for defining global varieties,
// please be careful while visiting this section

std::map<string, antlrcpp::Any> linkname;//main_variables
std::map<string, antlrcpp::Any> Global_var;//global variables
std::map<string, Python3Parser::FuncdefContext*> function;//var_name
std::map<string,std::map<string, antlrcpp::Any>> local_var;//local variables
bool inLocal = false;//visiting global or local
vector<antlrcpp::Any> pass_variables;//used to pass on variables
//this is the end of this period
//program innercore functions
size_t min(size_t a, size_t b)
{
    return (a < b) ? a : b;
}
size_t min(size_t a, size_t b, size_t c, size_t d)
{
    return min(a,min(b, min(c, d)));
}
void print(const antlrcpp::Any &clst)
{
    if(clst.is<string>())
    {
        std::cout << clst.as<string>();
    }
    else if(clst.is<binteger>())
    {
        std::cout << clst.as<binteger>();
    }
    else if(clst.is<double>())
    {
        double out = clst.as<double>();
        std::cout << std::setiosflags(std::ios::fixed) << std::setprecision(6) << clst.as<double>();
    }
    else if(clst.is<bool>())
    {
        if(clst.as<bool>())
        {
            std::cout << "True";
        }
        else
        {
            std::cout << "False";
        }
    }
    else if(clst.is<NoneExpr>())
    {
        std::cout << "None";
    }
    else if(clst.is<NameExpr>())
    {
        std::map<string, antlrcpp::Any>::iterator it;
        
        if (inLocal)
        {
            it = linkname.find(clst.as<NameExpr>().Name);
            if(it != linkname.end()){
                antlrcpp::Any rvst = it->second;
                print(rvst);
            }
            else
            {
                it = Global_var.find(clst.as<NameExpr>().Name);
                if(it != Global_var.end())
                {
                    antlrcpp::Any rvst = it->second;
                    print(rvst);
                }
                else throw ErrorArgument();
            }
            
        }
        else
        {
            it = Global_var.find(clst.as<NameExpr>().Name);
            if(it != Global_var.end())
            {
                antlrcpp::Any rvst = it->second;
                print(rvst);
            }
            else throw ErrorArgument();
        }
    }
}
void printvtr(antlrcpp::Any rcv)
{
    vector<antlrcpp::Any> op = rcv;
    auto it = op.begin();
    while (it != op.end())
    {
        print(*it);
        it++;
        if(it != op.end()) std::cout << " ";
    }
    std::cout << std::endl;
}
antlrcpp::Any Type(antlrcpp::Any op)
{
    if(op.is<binteger>() || op.is<double>() || op.is<string>())
    {
        return op;
    }
    else if(op.is<bool>())
    {
        binteger rt = (op.as<bool>()) ? 1 : 0;
        return rt;
    }
    else
    {
        throw ErrorArgument();
    }
}
antlrcpp::Any mns(antlrcpp::Any op)
{
    op = Type(op);
    if(op.is<binteger>())
    {
        binteger zero(0);
        return zero-op.as<binteger>();
    }
    else if(op.is<double>()) return -op.as<double>();
    else throw bad_trans_option();
}
bool CompArgument(antlrcpp::Any op1, antlrcpp::Any op2, string sign)
{
    op1 = Type(op1), op2 = Type(op2);
    if(op1.is<string>() && op2.is<string>())
    {
        string tp1 = op1.as<string>(), tp2 = op2.as<string>();
        if(sign == "==") return tp1 == tp2;
        else if(sign == "!=") return tp1 != tp2;
        else if(sign == ">=") return tp1 >= tp2;
        else if(sign == "<=") return tp1 <= tp2;
        else if(sign == ">") return tp1 > tp2;
        else if(sign == "<") return tp1 < tp2;
        else throw ErrorArgument();
    }
    else if(op1.is<binteger>() && op2.is<binteger>())
    {
        binteger tp1 = op1.as<binteger>(), tp2 = op2.as<binteger>();
        if(sign == "==") return tp1 == tp2;
        else if(sign == "!=") return tp1 != tp2;
        else if(sign == ">=") return tp1 >= tp2;
        else if(sign == "<=") return tp1 <= tp2;
        else if(sign == ">") return tp1 > tp2;
        else if(sign == "<") return tp1 < tp2;
        else throw ErrorArgument();
    }
    else if (op1.is<double>() && op2.is<double>())
    {
        double tp1 = op1.as<double>(), tp2 = op2.as<double>();
        if(sign == "==") return tp1 == tp2;
        else if(sign == "!=") return tp1 != tp2;
        else if(sign == ">=") return tp1 >= tp2;
        else if(sign == "<=") return tp1 <= tp2;
        else if(sign == ">") return tp1 > tp2;
        else if(sign == "<") return tp1 < tp2;
        else throw ErrorArgument();
    }
    else if(op1.is<double>() && op2.is<binteger>())
    {
        double tp1 = op1.as<double>(), tp2 = double(op2.as<binteger>());
        if(sign == "==") return tp1 == tp2;
        else if(sign == "!=") return tp1 != tp2;
        else if(sign == ">=") return tp1 >= tp2;
        else if(sign == "<=") return tp1 <= tp2;
        else if(sign == ">") return tp1 > tp2;
        else if(sign == "<") return tp1 < tp2;
        else throw ErrorArgument();
    }
    else if(op1.is<binteger>() && op2.is<double>())
    {
        double tp1 = (double)op1.as<binteger>(), tp2 = op2.as<double>();
        if(sign == "==") return tp1 == tp2;
        else if(sign == "!=") return tp1 != tp2;
        else if(sign == ">=") return tp1 >= tp2;
        else if(sign == "<=") return tp1 <= tp2;
        else if(sign == ">") return tp1 > tp2;
        else if(sign == "<") return tp1 < tp2;
        else throw ErrorArgument();
    }
    else throw ErrorArgument();
}
bool ToBool(antlrcpp::Any op)
{
    bool rt;
    if(op.is<bool>()) return op;
    else if (op.is<string>())
    {
        if(op.as<string>() == "") rt = false;
        else rt = true;
    }
    else if(op.is<NoneExpr>()) rt = false;
    else if (op.is<binteger>())
    {
        rt = (bool)op.as<binteger>();
    }
    else if (op.is<double>())
    {
        rt = (bool)op.as<double>();
    }
    else throw ErrorArgument();
    return rt;    
}
binteger ToInt(antlrcpp::Any op)
{
    if(op.is<binteger>()) return op;
    else if(op.is<string>())
    {
        string tmp = op.as<string>();
        binteger bk(0), zero(0);
        bool sign = true;
        for(int i = 0; i < tmp.size(); i++)
        {
            if(i == 0 && (tmp[i] == '-' || tmp[i] == '+'))
            {
                if(tmp[i] == '-') sign = false;
                continue;
            }
            bk *= 10;
            if(tmp[i] - '0' > 9 || tmp[i] - '0' < 0)
            {
                throw ErrorArgument();
            }
            bk += binteger(tmp[i] - '0');
        }
        return (sign) ? bk : zero-bk;
    }
    else if(op.is<bool>())
    {
        return Type(op);
    }
    else if(op.is<double>())
    {
        binteger bk(int(op.as<double>()));
        return bk;
    }
    else throw ErrorArgument();
}
double ToFloat(antlrcpp::Any op)
{
    if(op.is<double>())
    {
        return op.as<double>();
    }
    else if(op.is<binteger>())
    {
        return double(op.as<binteger>());
    }
    else if(op.is<bool>())
    {
        return (double)Type(op).as<binteger>();
    }
    else if(op.is<string>())
    {
        string tmp = op.as<string>();
        int i;
        bool f = true;
        double rtn;
        for(i = 0; i < tmp.size(); i++)
        {
            if(tmp[i] == '.')
            {
                f = false;
                break;
            }
        }
        if(f)
        {
            binteger bk(tmp);
            rtn = (double)bk;
        }
        else
        {
            bool sign = (tmp[0] == '-');
            if(sign)
            {
                tmp.erase(tmp.begin());
            }
            double x = 0, y = 0;
            for (int j = 0; j < i; j++)
            {
                x *= 10;
                if(tmp[i] - '0' > 9 || tmp[i] - '0' < 0) throw ErrorArgument();
                x += tmp[j] - '0';
            }
            for(int j = tmp.size() - 1; j > i; j--)
            {
                y /= 10;
                if(tmp[i] - '0' > 9 || tmp[i] - '0' < 0) throw ErrorArgument();
                y += double(tmp[j] - '0') / 10;
            }
            rtn = (sign) ? -x - y : x + y;
        }
        return rtn;
    }
    else
    {
        throw ErrorArgument();
    }
    
}
string ToStr(antlrcpp::Any op)
{
    if(op.is<string>()) return op;
    else if(op.is<binteger>()) return (string)op.as<binteger>();
    else if(op.is<bool>())
    {
        string bk = (op.as<bool>()) ? "True" : "False";
        return bk;
    }
    else if(op.is<double>())
    {
        int x;
        double y,z = op.as<double>();
        bool sign = true;
        if(z < 0){
            sign = false;
            z = -z;
        }
        string bk = "";
        x = int(z);
        y = z - x;
        y *= 100000;
        binteger a(x), b(y);
        if(!sign) bk = "-";
        bk = bk + string(a) + "." + string(b);
        return bk;
    }
    else throw ErrorArgument();
}
antlrcpp::Any plusargument(antlrcpp::Any op1, antlrcpp::Any op2, bool sign)
{
    op1 = Type(op1);
    op2 = Type(op2);
    if(op1.is<binteger>()&&op2.is<binteger>())
    {
        return (sign) ? op1.as<binteger>() + op2.as<binteger>() : op1.as<binteger>() - op2.as<binteger>();
    }
    else if(op1.is<double>()&&op2.is<double>())
    {
        return (sign) ? op1.as<double>() + op2.as<double>() : op1.as<double>() - op2.as<double>();
    }
    else if(op1.is<string>()&&op2.is<string>())
    {
        string c = op1.as<string>() + op2.as<string>();
        return c;
    }
    else if(op1.is<double>() && op2.is<binteger>())
    {
        double a = op1.as<double>();
        binteger b = op2.as<binteger>();
        return (sign) ? a += double(b): a -= double(b);
    }
    else if(op1.is<binteger>() && op2.is<double>())
    {
        double b = op2.as<double>();
        double a = double(op1.as<binteger>());
        return (sign) ? a += b: a -= b;
    }
    else {
        throw ErrorArgument();
    }
}
antlrcpp::Any multiargument(antlrcpp::Any tp1, antlrcpp::Any tp2, char sign)
{
    antlrcpp::Any op1 = Type(tp1);
    antlrcpp::Any op2 = Type(tp2);
    if(op1.is<binteger>() && op2.is<binteger>())
    {
        if(sign == '*')
        {
            return op1.as<binteger>() * op2.as<binteger>();
        }
        else if(sign == '/')
        {
            return (double)op1.as<binteger>() / (double)op2.as<binteger>();
        }
        else if(sign == '!')
        {
            return op1.as<binteger>() / op2.as<binteger>();
        }
        else
        {
            return op1.as<binteger>() % op2.as<binteger>();
        }
    }//same1
    else if(op1.is<double>() && op2.is<double>())
    {
        if(sign == '*')
        {
            return op1.as<double>() * op2.as<double>();
        }
        else if(sign == '/')
        {
            return op1.as<double>() / op2.as<double>();
        }
        else if(sign == '!')
        {
            binteger tp1(op1.as<double>()), tp2(op2.as<double>());
            return tp1 / tp2;
        }
        else
        {
            binteger tp1(op1.as<double>()), tp2(op2.as<double>());
            return tp1 % tp2;
        }
    }//same2
    else if(op1.is<string>()&&op2.is<binteger>())
    {
        string tmp;
        for(binteger i = 0; i < op2.as<binteger>(); i += 1)
        {
            tmp += op1.as<string>();
        }
        return tmp;
    }
    else if(op2.is<string>()&&op1.is<binteger>())
    {
        string tmp;
        for(binteger i = 0; i < op1.as<binteger>(); i += 1)
        {
            tmp += op2.as<string>();
        }
        return tmp;
    }
    else if(op1.is<string>()&&tp2.is<bool>())
    {
        string tmp;
        (tp2.as<bool>()) ? tmp = op1.as<string>() : tmp = "";
        return tmp; 
    }
    else if(op2.is<string>()&&tp1.is<bool>())
    {
        string tmp;
        (tp1.as<bool>()) ? tmp = op2.as<string>() : tmp = "";
        return tmp; 
    }
    else if (op1.is<binteger>() && op2.is<double>())
    {
        op1 = double(op1.as<binteger>());
        if(sign == '*')
        {
            return op1.as<double>() * op2.as<double>();
        }
        else if(sign == '/')
        {
            return op1.as<double>() / op2.as<double>();
        }
        else if(sign == '!')
        {
            binteger tp1(op1.as<double>()), tp2(op2.as<double>());
            return tp1 / tp2;
        }
        else
        {
            binteger tp1(op1.as<double>()), tp2(op2.as<double>());
            return tp1 % tp2;
        }
    }
    else
    {
        op2 = double(op2.as<binteger>());
        if(sign == '*')
        {
            return op1.as<double>() * op2.as<double>();
        }
        else if(sign == '/')
        {
            return op1.as<double>() / op2.as<double>();
        }
        else if(sign == '!')
        {
            binteger tp1(op1.as<double>()), tp2(op2.as<double>());
            return tp1 / tp2;
        }
        else
        {
            binteger tp1(op1.as<double>()), tp2(op2.as<double>());
            return tp1 % tp2;
        }
    }
}
antlrcpp::Any NameToValue(antlrcpp::Any rt)
{
    std::map<string, antlrcpp::Any>::iterator it;
    if(inLocal){
        it = linkname.find(rt.as<NameExpr>().Name);
        if(it != linkname.end())
        {
            rt = it->second;
        }
        else
        {
            it = Global_var.find(rt.as<NameExpr>().Name);
            if(it != Global_var.end())
            {
                rt = it->second;
            }
            else{
                throw four_o_four_not_found();
            }
        }
    }
    else
    {
        it = Global_var.find(rt.as<NameExpr>().Name);
        if(it != Global_var.end())
        {
            rt = it->second;
        }
        else{
            throw four_o_four_not_found();
        }
    }
    
    return rt;
}
class EvalVisitor: public Python3BaseVisitor {
antlrcpp::Any visitFile_input(Python3Parser::File_inputContext *ctx) override
{
    for(int i = 0; i < ctx->stmt().size(); i++)
    {
        antlrcpp::Any tmp = visitStmt(ctx->stmt(i));
    }
    Global_var.clear();
    linkname.clear();
    function.clear();
    auto it = local_var.begin();
    while(it != local_var.end())
    {
        it->second.clear();
        it++;
    }
    local_var.clear();
    return 0;
}

antlrcpp::Any visitFuncdef(Python3Parser::FuncdefContext *ctx) override {
    string fun_name = ctx->NAME()->toString();
    auto it = function.find(fun_name);
    if(it != function.end())
    {
        std::map<string, antlrcpp::Any> tmp = linkname;
        auto it = local_var.find(fun_name);
        if(it == local_var.end()) throw Parameter_undefined();
        bool original_state = inLocal;
        inLocal = true;
        std::map<string, antlrcpp::Any> rcv_para = it->second;
        if(!pass_variables.empty())
        {
            for(int i = 0; i < pass_variables.size(); i++)
            {
                antlrcpp::Any value = pass_variables[i];
                if(value.is<NameExpr>()) value = NameToValue(value);
                string var_name = ctx->parameters()->typedargslist()->tfpdef(i)->NAME()->toString();
                //std::cout << "variety name is: " << var_name << std::endl;
                auto it_assign = rcv_para.find(var_name);
                if(it_assign == rcv_para.end()) throw Argument_does_not_match();
                it_assign->second = value;
            }
        }
        linkname = rcv_para;
        antlrcpp::Any bk = visitSuite(ctx->suite());
        linkname = tmp;
        inLocal = original_state;
        if(!bk.is<ReturnExpr>())
        {
            NoneExpr none;
            ReturnExpr Rt;
            Rt.value = none;
            bk = Rt;
        }
        return bk;
    }
    else//the first_time declaration can't call for a function;
    {
        function[fun_name] = ctx;
        std::map<string, antlrcpp::Any> rcv;
        if(ctx->parameters())
        {
            std::map<string, antlrcpp::Any> tpsv = visitParameters(ctx->parameters());
            rcv = tpsv;
        }
        local_var[fun_name] = rcv;
    }
    return 0;
    //return visitChildren(ctx);
}

antlrcpp::Any visitParameters(Python3Parser::ParametersContext *ctx) override {
    if(ctx->typedargslist())
    {
        return visitTypedargslist(ctx->typedargslist());
    }
    else
    {
        std::map<string, antlrcpp::Any> bk;
        return bk;
    }
}

antlrcpp::Any visitTypedargslist(Python3Parser::TypedargslistContext *ctx) override {
    std::map<string, antlrcpp::Any> tmp_lkname;
    int edit_begin = 0;
    if(!ctx->tfpdef(0))
    {
        return tmp_lkname;
    }
    int size = ctx->tfpdef().size();
    if(!ctx->test(0))
    {
        for(int i = 0; i < size; i++)
        {
            string name = visitTfpdef(ctx->tfpdef(i)).as<NameExpr>().Name;
            NoneExpr none;
            tmp_lkname[name] = none;
        }
        return tmp_lkname;
    }
    int defined = ctx->test().size();
    int undef = size - defined;
    for(int i = 0; i < undef; i++)
    {
        string name = visitTfpdef(ctx->tfpdef(i)).as<NameExpr>().Name;
        NoneExpr none;
        tmp_lkname[name] = none;
    }
    for(int i = 0; i < defined; i++)
    {
        string name = visitTfpdef(ctx->tfpdef(i + undef)).as<NameExpr>().Name;
        antlrcpp::Any para = visitTest(ctx->test(i));
        tmp_lkname[name] = para;
    }
    return tmp_lkname;
    //return nullptr;
}

antlrcpp::Any visitTfpdef(Python3Parser::TfpdefContext *ctx) override {
    NameExpr bk;
    bk.Name = ctx->NAME()->toString();
    return bk;
}
antlrcpp::Any visitStmt(Python3Parser::StmtContext *ctx) override {
    if(ctx->simple_stmt())
    {
        return visitSimple_stmt(ctx->simple_stmt());
    }
    else if(ctx->compound_stmt())
    {
        return visitCompound_stmt(ctx->compound_stmt());
    }
    else return 0;
}

antlrcpp::Any visitSimple_stmt(Python3Parser::Simple_stmtContext *ctx) override {
    if(ctx->small_stmt())
    {
        return visitSmall_stmt(ctx->small_stmt());
    }
    return 0;
}

antlrcpp::Any visitSmall_stmt(Python3Parser::Small_stmtContext *ctx) override {
    if(ctx->expr_stmt())
    {
        return visitExpr_stmt(ctx->expr_stmt());
    }
    else if(ctx->flow_stmt())
    {
        return visitFlow_stmt(ctx->flow_stmt());
    }
    return 0;
}

antlrcpp::Any visitExpr_stmt(Python3Parser::Expr_stmtContext *ctx) override {
    if(ctx->testlist(0))
    {
        if(ctx->testlist(1) && ctx->augassign() == nullptr)
        {
            int size = ctx->testlist().size();
            for(int i = size - 1; i >= 1; i--)
            {
                std::vector<antlrcpp::Any> rcv1 = visitTestlist(ctx->testlist(i-1));
                std::vector<antlrcpp::Any> rcv2 = visitTestlist(ctx->testlist(i));
                for(int i = 0; i < rcv1.size(); i++)
                {
                    antlrcpp::Any cmp = rcv2[i];
                    if(rcv2[i].is<NameExpr>()) cmp = NameToValue(cmp);
                    if(inLocal){
                        if(linkname.empty())
                        {
                            linkname.insert(std::pair<string,antlrcpp::Any>(rcv1[i].as<NameExpr>().Name, cmp));
                            continue;
                        }
                        std::map<string, antlrcpp::Any>::iterator it;
                        it = linkname.find(rcv1[i].as<NameExpr>().Name);
                        if(it != linkname.end())
                        {
                            it->second = cmp;
                        }
                        else
                        {
                            linkname[rcv1[i].as<NameExpr>().Name] = cmp;
                        }
                    }
                    else
                    {
                        if(Global_var.empty())
                        {
                            Global_var.insert(std::pair<string,antlrcpp::Any>(rcv1[i].as<NameExpr>().Name, cmp));
                            continue;
                        }
                        std::map<string, antlrcpp::Any>::iterator it;
                        it = Global_var.find(rcv1[i].as<NameExpr>().Name);
                        if(it != Global_var.end())
                        {
                            it->second = cmp;
                        }
                        else
                        {
                            Global_var[rcv1[i].as<NameExpr>().Name] = cmp;
                        }
                    }
                }
            }
        }
        else if(ctx->augassign())
        {
            vector<antlrcpp::Any> rcv1 = visitTestlist(ctx->testlist(0));
            vector<antlrcpp::Any> rcv2 = visitTestlist(ctx->testlist(1));
            string sign;
            sign = visitAugassign(ctx->augassign()).as<string>();
            for(int i = 0; i < rcv1.size(); i++)
            {
                antlrcpp::Any op1, op2, tmp;
                op1 = rcv1[i];
                op2 = rcv2[i];
                if(op2.is<NameExpr>()) 
                {
                    op2 = NameToValue(op2);
                }
                tmp = NameToValue(op1);
                std::map<string, antlrcpp::Any>::iterator it;
                if(inLocal){
                    it = linkname.find(op1.as<NameExpr>().Name);
                    if(sign == "+=")
                    {
                        binteger one(1);
                        if(it != linkname.end())
                        {
                            tmp = plusargument(tmp, op2, true);
                            it->second = tmp;
                        }
                        else
                        {
                            throw ErrorArgument();
                        }
                    }
                    else if(sign == "-=")
                    {
                        if(it != linkname.end())
                        {
                            tmp = plusargument(tmp, op2, false);
                            it->second = tmp;
                        }
                        else
                        {
                            throw ErrorArgument();
                        }
                    }
                    else if(sign == "*=")
                    {  
                        if(it != linkname.end())
                        {
                            tmp = multiargument(tmp, op2, '*');
                            it->second = tmp;
                        }
                        else
                        {
                            throw ErrorArgument();
                        }
                    }
                    else if(sign == "/=")
                    {
                        if(it != linkname.end())
                        {
                            tmp = multiargument(tmp, op2, '/');
                            it->second = tmp;
                        }
                        else
                        {
                            throw ErrorArgument();
                        }
                    }
                    else if(sign == "//=")
                    {
                        if(it != linkname.end())
                        {   
                            tmp = multiargument(tmp, op2, '!');
                            it->second = tmp;
                        }
                        else
                        {
                            throw ErrorArgument();
                        }
                    }
                    else if(sign == "%=")
                    {
                        if(it != linkname.end())
                        {
                            tmp = multiargument(tmp, op2, '%');
                            it->second = tmp;
                        }
                        else
                        {
                            throw ErrorArgument();
                        }
                    }
                    else
                    {
                        throw No_sign_matched();
                    }
                }
                else
                {
                    it = Global_var.find(op1.as<NameExpr>().Name);
                    if(sign == "+=")
                    {
                        binteger one(1);
                        if(it != Global_var.end())
                        {
                            tmp = plusargument(tmp, op2, true);
                            it->second = tmp;
                        }
                        else
                        {
                            throw ErrorArgument();
                        }
                    }
                    else if(sign == "-=")
                    {
                        if(it != Global_var.end())
                        {
                            tmp = plusargument(tmp, op2, false);
                            it->second = tmp;
                        }
                        else
                        {
                            throw ErrorArgument();
                        }
                    }
                    else if(sign == "*=")
                    {  
                        if(it != Global_var.end())
                        {
                            tmp = multiargument(tmp, op2, '*');
                            it->second = tmp;
                        }
                        else
                        {
                            throw ErrorArgument();
                        }
                    }
                    else if(sign == "/=")
                    {
                        if(it != Global_var.end())
                        {
                            tmp = multiargument(tmp, op2, '/');
                            it->second = tmp;
                        }
                        else
                        {
                            throw ErrorArgument();
                        }
                    }
                    else if(sign == "//=")
                    {
                        if(it != Global_var.end())
                        {   
                            tmp = multiargument(tmp, op2, '!');
                            it->second = tmp;
                        }
                        else
                        {
                            throw ErrorArgument();
                        }
                    }
                    else if(sign == "%=")
                    {
                        if(it != Global_var.end())
                        {
                            tmp = multiargument(tmp, op2, '%');
                            it->second = tmp;
                        }
                        else
                        {
                            throw ErrorArgument();
                        }
                    }
                    else
                    {
                        throw No_sign_matched();
                    }
                }
                
            }
        }
        else if(ctx->testlist().size() == 1) 
        {
            return visitTestlist(ctx->testlist(0));
        }
    }
    return 0;
}
antlrcpp::Any visitAugassign(Python3Parser::AugassignContext *ctx) override {
    if(ctx->ADD_ASSIGN())
    {
        return ctx->ADD_ASSIGN()->getSymbol()->getText();
    }
    else if(ctx->SUB_ASSIGN())
    {
        return ctx->SUB_ASSIGN()->getSymbol()->getText();
    }
    else if(ctx->MULT_ASSIGN())
    {
        return ctx->MULT_ASSIGN()->getSymbol()->getText();
    }
    else if(ctx->DIV_ASSIGN())
    {
        return ctx->DIV_ASSIGN()->getSymbol()->getText();
    }
    else if(ctx->IDIV_ASSIGN())
    {
        return ctx->DIV_ASSIGN()->getSymbol()->getText();
    }
    else if(ctx->MOD_ASSIGN())
    {
        return ctx->MOD_ASSIGN()->getSymbol()->getText();
    }
    else
    {
        throw No_sign_matched();
    }
}

antlrcpp::Any visitFlow_stmt(Python3Parser::Flow_stmtContext *ctx) override {
    if(ctx->break_stmt())
    {
        return visitBreak_stmt(ctx->break_stmt());
    }
    else if(ctx->continue_stmt())
    {
        return visitContinue_stmt(ctx->continue_stmt());
    }
    else if(ctx->return_stmt())
    {
        return visitReturn_stmt(ctx->return_stmt());
    }
    return visitChildren(ctx);
}

 antlrcpp::Any visitBreak_stmt(Python3Parser::Break_stmtContext *ctx) override {
    Bre_ConExpr bk;
    bk.type = true;
    return bk;
}

antlrcpp::Any visitContinue_stmt(Python3Parser::Continue_stmtContext *ctx) override {
    Bre_ConExpr bk;
    bk.type = false;
    return bk;
    //return visitChildren(ctx);
}

antlrcpp::Any visitReturn_stmt(Python3Parser::Return_stmtContext *ctx) override {
    if(ctx->testlist())
    {
        vector<antlrcpp::Any> tmp = visitTestlist(ctx->testlist());
        if(tmp.size() > 1)
        {
            std::cerr << "to many arguments for return expression\n";
            throw to_many_arguments();
        }
        antlrcpp::Any fun = tmp[0];
        if(fun.is<NameExpr>()) fun = NameToValue(fun);
        ReturnExpr bk;
        bk.value = fun;
        return bk;
    }
    else
    {
        NoneExpr vl;
        ReturnExpr bk;
        bk.value = vl;
        return bk;
    }
}

antlrcpp::Any visitCompound_stmt(Python3Parser::Compound_stmtContext *ctx) override {
    if(ctx->if_stmt())
    {
        return visitIf_stmt(ctx->if_stmt());
    }
    else if(ctx->while_stmt())
    {
        return visitWhile_stmt(ctx->while_stmt());
    }
    else if(ctx->funcdef())
    {
        return visitFuncdef(ctx->funcdef());
    }
    else return nullptr;
    //return visitChildren(ctx);
}

antlrcpp::Any visitIf_stmt(Python3Parser::If_stmtContext *ctx) override {
    if(ctx->test(0))
    {
        int size = ctx->test().size();
        antlrcpp::Any ifstmt = visitTest(ctx->test(0));
        if(ifstmt.is<NameExpr>()) ifstmt = NameToValue(ifstmt);
        bool flag = false;
        if(ToBool(ifstmt))
        {
            antlrcpp::Any rcv1 = visitSuite(ctx->suite(0));
            if(rcv1.is<Bre_ConExpr>()) return rcv1;
            else if(rcv1.is<ReturnExpr>()) return rcv1;
            flag = true;
        }
        for(int i = 1; i < size; i++)
        {
            if(flag) break;
            antlrcpp::Any elifstmt = visitTest(ctx->test(i));
            if (elifstmt.is<NameExpr>()) elifstmt = NameToValue(elifstmt);
            if(ToBool(elifstmt))
            {
                antlrcpp::Any rcv2 = visitSuite(ctx->suite(i));
                if(rcv2.is<Bre_ConExpr>()) return rcv2;
                else if(rcv2.is<ReturnExpr>()) return rcv2;
                flag = true;
            }
            else continue;
        }
        if(ctx->ELSE() && !flag)
        {
            antlrcpp::Any rcv3 = visitSuite(ctx->suite(size));
            if(rcv3.is<Bre_ConExpr>()) return rcv3;
            else if(rcv3.is<ReturnExpr>()) return rcv3;
        }
        return nullptr;
        
    }
    return nullptr;
    //return visitChildren(ctx);
}

antlrcpp::Any visitWhile_stmt(Python3Parser::While_stmtContext *ctx) override {
    antlrcpp::Any condition = visitTest(ctx->test());
    if(condition.is<NameExpr>()) condition = NameToValue(condition);
    while (ToBool(condition))
    {
        int size = ctx->suite()->stmt().size();
        antlrcpp::Any tmp = visitSuite(ctx->suite());
        condition = visitTest(ctx->test());
        if(condition.is<NameExpr>()) condition = NameToValue(condition);
        if(tmp.is<Bre_ConExpr>())
        {
            if(tmp.as<Bre_ConExpr>().type) break;
            else continue;
        }
        else if(tmp.is<ReturnExpr>()) return tmp;
    }
    return nullptr;
}

antlrcpp::Any visitSuite(Python3Parser::SuiteContext *ctx) override {
    if(ctx->simple_stmt())
    {
        return visitSimple_stmt(ctx->simple_stmt());
    }
    else if(ctx->stmt(0))
    {
        antlrcpp::Any tmp;
        for(int i = 0; i < ctx->stmt().size(); i++)
        {
            tmp = visitStmt(ctx->stmt(i));
            if(tmp.is<Bre_ConExpr>()) return tmp;
            else if(tmp.is<ReturnExpr>()) return tmp;
        }
        return tmp;
    }
    return nullptr;
}

antlrcpp::Any visitTest(Python3Parser::TestContext *ctx) override {
    if(ctx->or_test())
    {
        //std::cout<<"visitedtest\n";
        return visitOr_test(ctx->or_test());
    }
    return 0;
}

 antlrcpp::Any visitOr_test(Python3Parser::Or_testContext *ctx) override {
    if(ctx->and_test(0))
    {
        if(ctx->and_test(1))
        {
            antlrcpp::Any cmp = visitAnd_test(ctx->and_test(0));
            if(cmp.is<NameExpr>()) cmp = NameToValue(cmp);
            if(ToBool(cmp)) return true;
            for(int i = 1; i < ctx->and_test().size(); i++)
            {
                antlrcpp::Any tmp = visitAnd_test(ctx->and_test(i));
                if(tmp.is<NameExpr>()) tmp = NameToValue(tmp);
                if(ToBool(tmp)) return true;
                cmp = tmp;
            }
            return ToBool(cmp);
        }
        else return visitAnd_test(ctx->and_test(0)); 
    }
    return 0;
}

antlrcpp::Any visitAnd_test(Python3Parser::And_testContext *ctx) override {
    if(ctx->not_test(0))
    {
        if(ctx->not_test(1))
        {
            antlrcpp::Any cmp = visitNot_test(ctx->not_test(0));
            if(cmp.is<NameExpr>()) cmp = NameToValue(cmp);

            if(!ToBool(cmp)) return false;
            for(int i = 1; i < ctx->not_test().size(); i++)
            {
                antlrcpp::Any tmp = visitNot_test(ctx->not_test(i));
                if(tmp.is<NameExpr>()) tmp = NameToValue(tmp);

                if(!ToBool(tmp)) return false;
                
                cmp = tmp;
            }
            return ToBool(cmp);
        }
        else return visitNot_test(ctx->not_test(0));
    }
    return 0;
}

antlrcpp::Any visitNot_test(Python3Parser::Not_testContext *ctx) override {
    if(ctx->comparison())
    {
        if(ctx->NOT())
        {
            antlrcpp::Any op = visitComparison(ctx->comparison());
            if(op.is<NameExpr>()) op = NameToValue(op);
            return !ToBool(op);            
        }
        else return visitComparison(ctx->comparison());
    }
    else if(ctx->not_test())
    {
        if(ctx->NOT())
        {
            antlrcpp::Any op = visitNot_test(ctx->not_test());
            if(op.is<NameExpr>()) op = NameToValue(op);
            return !ToBool(op);            
        }
        else return visitNot_test(ctx->not_test());
    }
    return 0;
}

antlrcpp::Any visitComparison(Python3Parser::ComparisonContext *ctx) override {
    if(ctx->arith_expr(0))
    {
        if(ctx->arith_expr(1))
        {
            antlrcpp::Any comp = visitArith_expr(ctx->arith_expr(0));
            if(comp.is<NameExpr>()) comp = NameToValue(comp);
            int size = ctx->arith_expr().size();
            bool rt = true;
            for(int i = 1; i < size; i++)
            {
                antlrcpp::Any tmp = visitArith_expr(ctx->arith_expr(i));
                if(tmp.is<NameExpr>())tmp = NameToValue(tmp);
                string sign = visitComp_op(ctx->comp_op(i-1));
                rt = rt && CompArgument(comp, tmp, sign);
                comp = tmp;
            }
            return rt;
        }
        else return visitArith_expr(ctx->arith_expr(0));
    }
    return nullptr;
}

 antlrcpp::Any visitComp_op(Python3Parser::Comp_opContext *ctx) override {
    if(ctx->EQUALS())
    {
        return ctx->EQUALS()->getSymbol()->getText();
    }
    else if(ctx->GREATER_THAN())
    {
        return ctx->GREATER_THAN()->getSymbol()->getText();
    }
    else if (ctx->LESS_THAN())
    {
        return ctx->LESS_THAN()->getSymbol()->getText();
    }
    else if(ctx->GT_EQ())
    {
        return ctx->GT_EQ()->getSymbol()->getText();
    }
    else if(ctx->LT_EQ())
    {
        return ctx->LT_EQ()->getSymbol()->getText();
    }
    else if(ctx->NOT_EQ_2())
    {
        return ctx->NOT_EQ_2()->getSymbol()->getText();
    }
    else throw four_o_four_not_found();
}
antlrcpp::Any visitArith_expr(Python3Parser::Arith_exprContext *ctx) override {
    if(ctx->term(0))
    {
        if(ctx->term(1))
        {
            int size = ctx->term().size();
            antlrcpp::Any rt = visitTerm(ctx->term(0));
            if(rt.is<NameExpr>())
            {
                rt = NameToValue(rt);  
            }
            int opadd = ctx->ADD().size(), opmns = ctx->MINUS().size(), bga = 0, bgm = 0;
            vector<bool> sign;
            while(bga < opadd || bgm < opmns)
            {
                if (bga >= opadd)//noplus
                {
                    for(; bgm < opmns; bgm++)
                    {
                        sign.push_back(0);//add minus
                    }
                    break;
                }
                else if(bgm >= opmns)
                {
                    for(; bga < opadd; bga++)
                    {
                        sign.push_back(1);
                    }
                    break;
                }
                size_t tmp1 = ctx->ADD(bga)->getSymbol()->getTokenIndex(), tmp2 = ctx->MINUS(bgm)->getSymbol()->getTokenIndex();
                if(tmp1 < tmp2)
                {
                    sign.push_back(1);
                    bga++;
                }
                else
                {
                    sign.push_back(0);
                    bgm++;
                }
                
            }
            for(int i = 1; i < size; i++)
            {
                antlrcpp::Any tmp = visitTerm(ctx->term(i));
                if(tmp.is<NameExpr>())
                {
                    tmp = NameToValue(tmp);
                }
                rt = plusargument(rt, tmp, sign[i-1]);
            }
            return rt;
        }
        else
        {
            return visitTerm(ctx->term(0));
        }
        
    }

    return 0;
}

antlrcpp::Any visitTerm(Python3Parser::TermContext *ctx) override {
    if(ctx->factor(0))
    {
        if(ctx->factor(1))
        {
            int size = ctx->factor().size();
            antlrcpp::Any rt = visitFactor(ctx->factor(0));
            if(rt.is<NameExpr>())
            {
                rt = NameToValue(rt);  
            }
            int opmti = ctx->STAR().size(), opdiv = ctx->DIV().size(), opidv = ctx->IDIV().size(), opmod = ctx->MOD().size();
            int mti = 0, div = 0, idv = 0, mod = 0;
            vector<char> sign;
            while(mti < opmti || div < opdiv || idv < opidv || mod < opmod)
            {
                size_t tmp1 = max, tmp2 = max, tmp3 = max, tmp4 = max;
                if(mti < opmti)
                {
                    tmp1 = ctx->STAR(mti)->getSymbol()->getTokenIndex();
                }
                if(div < opdiv)
                {
                    tmp2 = ctx->DIV(div)->getSymbol()->getTokenIndex();
                }
                if(idv < opidv)
                {
                    tmp3 = ctx->IDIV(idv)->getSymbol()->getTokenIndex();
                }
                if(mod < opmod)
                {
                    tmp4 = ctx->MOD(mod)->getSymbol()->getTokenIndex();
                }//gain storage
                size_t tmp = min(tmp1, tmp2, tmp3, tmp4);
                if(tmp == tmp1)
                {
                    mti++;
                    sign.push_back('*');
                }
                else if(tmp == tmp2)
                {
                    div++;
                    sign.push_back('/');
                }
                else if(tmp == tmp3)
                {
                    idv++;
                    sign.push_back('!');
                }
                else if(tmp == tmp4)
                {
                    mod++;
                    sign.push_back('%');
                }
            }
            for(int i = 1; i < size; i++)
            {
                antlrcpp::Any arg = visitFactor(ctx->factor(i));
                if(arg.is<NameExpr>())
                {
                    arg = NameToValue(arg);
                }
                rt = multiargument(rt, arg, sign[i-1]);
            }
            return rt;
        }
        else return visitFactor(ctx->factor(0));
    }
    return 0;
}

 antlrcpp::Any visitFactor(Python3Parser::FactorContext *ctx) override {
    if(ctx->atom_expr())
    {
        return visitAtom_expr(ctx->atom_expr());
    }
    else if(ctx->factor())
    {
        antlrcpp::Any bk = visitFactor(ctx->factor());
        if(bk.is<NameExpr>()) bk = NameToValue(bk);
        if(ctx->MINUS()) 
        {
            bk = mns(bk);
        }
        else if(ctx->ADD())
        {
            bk = Type(bk);
        }
        return bk;
    }
    return 0;
}

 antlrcpp::Any visitAtom_expr(Python3Parser::Atom_exprContext *ctx) override {
    if(ctx->trailer())
    {
        antlrcpp::Any nlst, clst;
        vector<antlrcpp::Any> rcv = visitTrailer(ctx->trailer());
        nlst = visitAtom(ctx->atom());
        auto it = function.find(nlst.as<NameExpr>().Name);
        if(nlst.as<NameExpr>().Name == "print")
        {
            printvtr(rcv);
        }
        else if(nlst.as<NameExpr>().Name == "int")
        {
            clst = rcv[0];
            if(clst.is<NameExpr>()) clst = NameToValue(clst);
            return ToInt(clst);
        }
        else if(nlst.as<NameExpr>().Name == "bool")
        {
            clst = rcv[0];
            if(clst.is<NameExpr>()) clst = NameToValue(clst);
            return ToBool(clst);
        }
        else if(nlst.as<NameExpr>().Name == "float")
        {
            clst = rcv[0];
            if(clst.is<NameExpr>()) clst = NameToValue(clst);
            return ToFloat(clst);
        }
        else if(nlst.as<NameExpr>().Name == "str")
        {
            clst = rcv[0];
            if(clst.is<NameExpr>()) clst = NameToValue(clst);
            return ToStr(clst);
        }
        else if(it != function.end())
        {
            vector<antlrcpp::Any> tmp = pass_variables;
            pass_variables = rcv;
            antlrcpp::Any bkn = visitFuncdef(it->second);
            pass_variables = tmp;
            if(!bkn.is<ReturnExpr>())
            {
                std::cout << "FUNCTION ERROR!!!! PROGRAM TERMINATED!!!\n";
                throw Cannot_connect_function();
            }
            bkn = bkn.as<ReturnExpr>().value;
            return bkn;
        }
        else
        {
            return visitTrailer(ctx->trailer());
        }
    }
    else if(ctx->atom())
    {
        //std::cout<<"fromatomexprtoatom\n";
        return visitAtom(ctx->atom());
    }
    return visitChildren(ctx);
}

antlrcpp::Any visitTrailer(Python3Parser::TrailerContext *ctx) override {
    if(ctx->arglist())
    {
        return visitArglist(ctx->arglist());
    }
    else
    {
        vector<antlrcpp::Any> bk;
        return bk;
    }
    //return visitChildren(ctx);
}

antlrcpp::Any visitAtom(Python3Parser::AtomContext *ctx) override {
    if(ctx->NAME())
    {
        NameExpr bk;
        bk.Name = ctx->NAME()->toString();
        return bk;
    }
    else if(!ctx->STRING().empty())
    {
        int cnt = ctx->STRING().size();
        string rtn;
        for(int i = 0; i < cnt; i++)
        {
            string tmp = ctx->STRING(i)->toString();
            int sz= tmp.length();
            if(tmp[sz - 1] == '\"' || tmp[sz - 1] == '\'')
            {
                tmp.erase(sz - 1, 1);
            }
            if(tmp[0] == '\"' || tmp[0] == '\'')
            {
                tmp.erase(0,1);
            }
            rtn += tmp;
        }
        return rtn;
    }
    else if(ctx->NUMBER())
    {
        //std::cout<<"visiting number\n";
        string tmp = ctx->NUMBER()->toString();
        int i;
        bool f = true;
        if(tmp.size() > 18)
        {
            binteger bk(tmp);
            return bk;
        }
        for(i = 0; i < tmp.size(); i++)
        {
            if(tmp[i] == '.')
            {
                f = false;
                break;
            }
        }
        if(f)
        {
            binteger bk(tmp);
            return bk;
        }
        else
        {
            bool sign = (tmp[0] == '-');
            if(sign)
            {
                //std::cout<<"- sign marked\n";
                tmp.erase(tmp.begin());
            }
            double x = 0, y = 0;
            for (int j = 0; j < i; j++)
            {
                x *= 10;
                x += tmp[j] - '0';
            }
            for(int j = tmp.size() - 1; j > i; j--)
            {
                y /= 10;
                y += double(tmp[j] - '0') / 10;
            }
            return (sign) ? -x - y : x + y;
        }
    }
    else if(ctx->TRUE())
    {
        return true;
    }
    else if(ctx->FALSE())
    {
        return false;
    }
    else if(ctx->NONE())
    {
        NoneExpr zero;
        return zero;
    }
    else if(ctx->test())
    {
        return visitTest(ctx->test());
    }
    return visitChildren(ctx);
}

antlrcpp::Any visitTestlist(Python3Parser::TestlistContext *ctx) override {
    if(ctx->test(0))
    {
        //std::cout << "visitedtestlist\n";
        int amout = ctx->test().size();
        std::vector<antlrcpp::Any> bk;
        for(int i = 0; i < amout; i++)
        {
            antlrcpp::Any rcv = visitTest(ctx->test(i));
            bk.push_back(rcv);
        }
        return bk;
    }
    return 0;
}

antlrcpp::Any visitArglist(Python3Parser::ArglistContext *ctx) override {
    if(ctx->argument(0))
    {
        vector<antlrcpp::Any> bk;
        for(int i = 0; i < ctx->argument().size(); i++)
        {
            bk.push_back(visitArgument(ctx->argument(i)));
        }
        return bk;
    }
    return visitChildren(ctx);
}

antlrcpp::Any visitArgument(Python3Parser::ArgumentContext *ctx) override {

    if(ctx->test())
    {
        return visitTest(ctx->test());
    }
    return visitChildren(ctx);
}
//todo:override all methods of Python3BaseVisitor
};


#endif //PYTHON_INTERPRETER_EVALVISITOR_H
