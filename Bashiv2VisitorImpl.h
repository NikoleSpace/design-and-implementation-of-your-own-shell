#ifndef _BASHI_V2_VISITOR_IMPL_
#define _BASHI_V2_VISITOR_IMPL_

#include "Bashiv2BaseVisitor.h"
#include "Bashiv2Parser.h"
#include "Bashiv2Lexer.h"
#include <algorithm>
#include <any>
#include <iostream>
#include <map>
#include <memory>
#include <string>
#include <system_error>

class BashiV2VisitorImpl : Bashiv2BaseVisitor {
public:
  /*
  BashiV2VisitorImpl()
      : context(std::make_unique<llvm::LLVMContext>()),
        module(std::make_unique<llvm::Module>("BashiV2", *context)),
        builder(std::make_unique<llvm::IRBuilder<>>(*context)) {}
  */

  virtual antlrcpp::Any visitScript(Bashiv2Parser::ScriptContext *ctx) override;
  virtual antlrcpp::Any visitStatement(Bashiv2Parser::StatementContext *ctx) override;
  virtual antlrcpp::Any visitCommand(Bashiv2Parser::CommandContext *ctx) override;
  virtual antlrcpp::Any visitSimpleCommand(Bashiv2Parser::SimpleCommandContext *ctx) override;
  virtual antlrcpp::Any visitIfCommand(Bashiv2Parser::IfCommandContext *ctx) override;
  //virtual antlrcpp::Any visitSwitchCommand(Bashiv2Parser::SwitchCommandContext *ctx) override;
  //virtual antlrcpp::Any visitSwitchCases(Bashiv2Parser::SwitchCasesContext *ctx) override;
  virtual antlrcpp::Any visitLoop(Bashiv2Parser::LoopContext *ctx) override;
  virtual antlrcpp::Any visitAssignment(Bashiv2Parser::AssignmentContext *ctx) override;
  virtual antlrcpp::Any visitWord(Bashiv2Parser::WordContext *ctx) override;
  //virtual antlrcpp::Any visitListDeclaration(Bashiv2Parser::ListDeclarationContext *ctx) override;
  //virtual antlrcpp::Any visitCondition(Bashiv2Parser::ConditionContext *ctx) override;
  //virtual antlrcpp::Any visitExpression(Bashiv2Parser::ExpressionContext *ctx) override;
  //virtual antlrcpp::Any visitSimpleExpression(Bashiv2Parser::SimpleExpressionContext *ctx) override;
  //virtual antlrcpp::Any visitVariable(Bashiv2Parser::VariableContext *ctx) override;

  /*
  void generateLLVMCode() {
    std::error_code error;
    llvm::raw_fd_stream outLL("output.ll", error);
    module->print(outLL, nullptr);
  }*/

private:
  std::map<std::string, std::any> memory; // symbol table
  /*std::map<std::string, std::any> memory;
  std::unique_ptr<llvm::LLVMContext> context;
  std::unique_ptr<llvm::Module> module;
  std::unique_ptr<llvm::IRBuilder<>> builder;
  */
};

#endif
